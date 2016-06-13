package com.scoreManager.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


/**
 * DataBase.
 * 
 * @author 刘鑫伟
 *
 */
public class DataBase {

	public static final String STUDENT_TABLE = "student";
	public static final String COURSE_TABLE = "course";
	public static final String CHOOSE_TABLE = "choose";
	public static final String MANGER_TABLE = "manager";

	private Connection connection;
	private Statement statement;
	private String driver = "com.mysql.jdbc.Driver";
	private String url = "jdbc:mysql://localhost:3306/scoremanager";
	private String username = "root";
	private String password = "root";
	private String sql;

	public DataBase() {
		try {
			// 建立数据库的连接
			Class.forName(driver);
			connection = DriverManager.getConnection(url, username, password);
			statement = connection.createStatement();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * execute sql.
	 * 
	 * @param sql
	 *            sql.
	 * @return is ok.
	 */
	public boolean executeSql(String sql) {
		try {
			int result = statement.executeUpdate(sql);
			if (result > 0) {
				return true;
			}
			return false;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	/**
	 * 插入信息。
	 * @param object
	 * @return
	 */
	public boolean insertInfo(Object object, String wantTo) {
		if ("insertStudentInfo".equals(wantTo)) {
			Student student = (Student) object;
			sql = "insert into " + STUDENT_TABLE + " (sid, sname, age) values(" 
					+ student.getId() + ",'" + student.getName()  + "'," 
					+ student.getAge() +");";
		} else if ("insertCourseInfo".equals(wantTo)){
			Course course = (Course) object;
			sql = "insert into " + COURSE_TABLE + " (cid, cname) values(" 
					+  course.getCid() + ",'" + course.getCname() + "');";
		} else if ("insertScore".equals(wantTo)){
			ArrayList<Integer> info = (ArrayList<Integer>) object;
			sql = "insert into " + CHOOSE_TABLE + "(sid, cid, score) values(" 
					+ info.get(0) + "," + info.get(1) + "," + info.get(2) + ");";
		} else {
			//insert managerInfo.
			Manager manager = (Manager)object;
			sql = "insert into " + MANGER_TABLE + " (name, password) values('"
					+ manager.getName() + "','" + manager.getPassword() + "');";
		}

		return executeSql(sql);
	}

	/**
	 * search.
	 * @param object
	 * @return
	 */
	public Object search(Object object, String wantTo) {
		
		if (object instanceof Manager) {
			Manager manager = (Manager)object;
			sql = "select name,password from " + MANGER_TABLE + " where name='" 
					+  manager.getName() + "';";
			manager.setName("null");
			manager.setPassword("null");
			try {
				ResultSet resultSet = statement.executeQuery(sql);
				while (resultSet.next()) {
					manager.setName(resultSet.getString("name"));
					manager.setPassword(resultSet.getString("password"));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			object = manager;
		} else if ("searchStudentInfo".equals(wantTo)) {
			Student student = (Student)object;
			sql = "select * from student where sid = " + student.getId() + ";";
			
			try {
				ResultSet resultSet = statement.executeQuery(sql);
				while (resultSet.next()) {
					student.setName(resultSet.getString("sname"));
					student.setAge(Integer.parseInt((resultSet.getString("age"))));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			object = student;
			//TODO else man.
		} else if ("searchCourseInfo".equals(wantTo)) {
			ArrayList<Course> courses = new ArrayList<Course>();
			sql = "select * from course;";

			try {
				ResultSet resultSet = statement.executeQuery(sql);
				while (resultSet.next()) {
					courses.add(new Course(Integer.parseInt(resultSet.getString(
							"cid")), resultSet.getString("cname")));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			object = courses;
		} else if ("searchScore".equals(wantTo)) {
			Student student = (Student)object;
			sql = "select student.sid,sname,age,course.cid, cname, score from "
					+ "student, course, choose where student.sid = choose.sid "
					+ "and course.cid = choose.cid and student.sid=" 
					+ student.getId() + ";";
			
			try {
				ResultSet resultSet = statement.executeQuery(sql);
				while (resultSet.next()) {
					if (student.getName() == null) {
						student.setName(resultSet.getString("sname"));
						student.setAge(Integer.parseInt((resultSet.getString("age"))));
						student.setCourses(new ArrayList<Course>());
					} 
					student.getCourses().add(new Course(Integer.parseInt(resultSet.getString(
							"cid")), resultSet.getString("cname"), Integer.parseInt(resultSet.getString(
									"score"))));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			object = student;
			
		}
		
		return object;
	}
	
	/**
	 * update.
	 * @param object
	 * @param wantTo
	 * @return
	 */
	public boolean updateInfo(Object object, String wantTo) {
		if ("updateStudentInfo".equals(wantTo)) {
			Student student = (Student) object;
			//TODO 修改其他信息。
			//修改姓名
			sql = "update " + STUDENT_TABLE + " set sname= '" + student.getName()
					+ "',age=" + student.getAge()
					+ " where sid = " + student.getId() + ";";
		} else if ("updateCourseInfo".equals(wantTo)) {
			Course course = (Course) object;
			sql = "update " + COURSE_TABLE + " set cname='" + course.getCname() 
					+ "' where cid =" + course.getCid(); 
		} else if ("updateScore".equals(wantTo)) {
			ArrayList<Integer> info = (ArrayList<Integer>)object;
			sql = "update " + CHOOSE_TABLE + " set score=" + info.get(2) 
					+ " where cid=" + info.get(1) + " and sid=" + info.get(0) 
					+ ";";
		} else {
			//manager.
		}
		
		
		return executeSql(sql);
	}
	
	/**
	 *  delete.
	 * @return
	 */
	public boolean delete(Object object, String wantTo) {
		if ("deleteStudentInfo".equals(wantTo)) {
			Student student = (Student)object;
			sql = "delete from " + STUDENT_TABLE + " where sid=" 
					+ student.getId() + ";";
		} else if ("deleteCourseInfo".equals(wantTo)) {
			Course course = (Course)object;
			sql = "delete from " + COURSE_TABLE + " where cid=" 
					+ course.getCid() + ";";
		} else if ("deleteScore".equals(wantTo)) {
			ArrayList<Integer> info = (ArrayList<Integer>) object;
			sql = "delete from " + CHOOSE_TABLE + " where sid=" + info.get(0) 
					+ " and cid=" + info.get(1) + ";"; 
		} 
		
		return executeSql(sql);
	}
}
