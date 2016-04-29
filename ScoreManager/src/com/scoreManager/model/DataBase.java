package com.scoreManager.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * DataBase.
 * 
 * @author 刘鑫伟
 *
 */
public class DataBase {

	public static final String STUDENT_TABLE = "student";
	public static final String SCORE_TABLE = "score";
	public static final String MANGER_TABLE = "manager";

	private Connection connection;
	private Statement statement;
	private String driver = "com.mysql.jdbc.Driver";
	private String url = "jdbc:mysql://localhost:3306/scoremanager";
	private String username = "root";
	private String password = "root";
	private Student student;

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

	public boolean insertInfo(Object object) {
		String sql = null;
		if (object instanceof Student) {
			Student student = (Student) object;
			sql = "insert into " + STUDENT_TABLE + " (sid, sname) values(" 
			+ student.getId() + ",'" + student.getName() +"');";
		} else if (object instanceof Score){
			Score score = (Score) object;
			sql = "insert into " + SCORE_TABLE + " (sid, math, chinese, english) "
					+ "values(" + student.getId() + "," + score.getMath() + "," 
					+ score.getChinese() + ","  + score.getEnglish() + ");";
		} else {
			Manager manager = (Manager)object;
			sql = "insert into " + MANGER_TABLE + " (name, password) values('"
					+ manager.getName() + "','" + manager.getPassword() + "');";
		}

		return executeSql(sql);
	}

	public static void main(String[] args) {
		DataBase dataBase = new DataBase();
		
		dataBase.student = new Student(2013400, "刘鑫伟");
		Manager manager = new Manager("20134019", "20134019");
		
		Score score = new Score(99, 99, 88);
		dataBase.insertInfo(manager);
	}
	
}