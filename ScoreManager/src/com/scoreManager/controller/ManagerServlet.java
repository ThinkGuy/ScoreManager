package com.scoreManager.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.scoreManager.model.Course;
import com.scoreManager.model.DataBase;
import com.scoreManager.model.Student;

/**
 * Servlet implementation class ManagerServlet
 */
@WebServlet("/ManagerServlet")
public class ManagerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private String wantTo;
    private Student student;
    private Course course;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DataBase dataBase = new DataBase();
		wantTo = request.getParameter("wantTo");
		
		RequestDispatcher view = null;
		if ("searchStudentInfo".equals(wantTo)) {
			student = new Student(Integer.parseInt(
					request.getParameter("sid")));
			student = (Student)dataBase.search(student, wantTo);
			view = request.getRequestDispatcher("display-StudentInfo.jsp");
			request.setAttribute("student", student);
		} else if ("searchCourseInfo".equals(wantTo)) {
			ArrayList<Course> courses  = (ArrayList<Course>)dataBase.search(null
					, wantTo);
			view = request.getRequestDispatcher("displayCourseInfo.jsp");
			request.setAttribute("courses", courses);
		} else if ("searchScore".equals(wantTo)) {
			student = new Student(Integer.parseInt(
					request.getParameter("sid")));
			student = (Student)dataBase.search(student, wantTo);
			view = request.getRequestDispatcher("displayScore.jsp");
			request.setAttribute("student", student);
		} else if ("insertStudentInfo".equals(wantTo)) {
			student = new Student(Integer.parseInt(request.getParameter("sid")),
					request.getParameter("name"));
			student.setAge(Integer.parseInt(request.getParameter("age")));
			dataBase.insertInfo(student, wantTo);
			view = request.getRequestDispatcher("display-StudentInfo.jsp");
			request.setAttribute("student", student);
		} else if ("insertCourseInfo".equals(wantTo)) {
			Course course = new Course(Integer.parseInt(request.getParameter("cid")),
					request.getParameter("cname"));
			dataBase.insertInfo(course, wantTo);
			view = request.getRequestDispatcher("success.jsp");
		} else if ("insertScore".equals(wantTo)) {
			ArrayList<Integer> info = new ArrayList<Integer>();
			info.add(Integer.parseInt(request.getParameter("sid")));
			info.add(Integer.parseInt(request.getParameter("cid")));
			info.add(Integer.parseInt(request.getParameter("score")));
			dataBase.insertInfo(info, wantTo);
			view = request.getRequestDispatcher("success.jsp");
 		} else if ("updateStudentInfo".equals(wantTo)) {
 			student = new Student(Integer.parseInt(request.getParameter("sid")),
					request.getParameter("name"));
			student.setAge(Integer.parseInt(request.getParameter("age")));
			dataBase.updateInfo(student, wantTo);
			view = request.getRequestDispatcher("success.jsp");
 		} else if ("updateCourseInfo".equals(wantTo)) {
 			Course course = new Course(Integer.parseInt(request.getParameter("cid")),
					request.getParameter("cname"));
 			dataBase.updateInfo(course, wantTo);
 			view = request.getRequestDispatcher("success.jsp");
 		} else if ("updateScore".equals(wantTo)) {
 			ArrayList<Integer> info = new ArrayList<Integer>();
			info.add(Integer.parseInt(request.getParameter("sid")));
			info.add(Integer.parseInt(request.getParameter("cid")));
			info.add(Integer.parseInt(request.getParameter("score")));
			dataBase.updateInfo(info, wantTo);
			view = request.getRequestDispatcher("success.jsp");
 		} else if ("deleteStudentInfo".equals(wantTo)) {
 			student = new Student(Integer.parseInt(
					request.getParameter("sid")));
			if (dataBase.delete(student, wantTo)) {
				view = request.getRequestDispatcher("success.jsp");
				request.setAttribute("student", student);
			}
 		} else if ("deleteCourseInfo".equals(wantTo)) {
 			course = new Course(Integer.parseInt(request.getParameter("cid")));
 			if (dataBase.delete(course, wantTo)) {
				view = request.getRequestDispatcher("success.jsp");
				request.setAttribute("student", student);
			}
 		} else if ("deleteScore".equals(wantTo)) {
 			ArrayList<Integer> info = new ArrayList<Integer>();
 			info.add(Integer.parseInt(request.getParameter("sid")));
 			info.add(Integer.parseInt(request.getParameter("cid")));
 			if (dataBase.delete(info, wantTo)) {
				view = request.getRequestDispatcher("success.jsp");
				request.setAttribute("student", student);
			}
 		}
		
		view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

