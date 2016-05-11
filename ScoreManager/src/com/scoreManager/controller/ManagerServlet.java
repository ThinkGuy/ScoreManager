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
	
 

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DataBase dataBase = new DataBase();
		wantTo = request.getParameter("wantTo");
		
		RequestDispatcher view = null;
		if ("searchStudentInfo".equals(wantTo)) {
			Student student = new Student(Integer.parseInt(
					request.getParameter("sid")));
			student = (Student)dataBase.search(student, wantTo);
			view = request.getRequestDispatcher("display-StudentInfo.jsp");
			request.setAttribute("student", student);
		} else if ("searchCourseInfo".equals(wantTo)) {
			ArrayList<Course> courses  = (ArrayList<Course>)dataBase.search(null, wantTo);
			view = request.getRequestDispatcher("displayCourseInfo.jsp");
			request.setAttribute("courses", courses);
		} else if ("searchScore".equals(wantTo)) {
			Student student = new Student(Integer.parseInt(
					request.getParameter("sid")));
			student = (Student)dataBase.search(student, wantTo);
			System.out.println(student.toString());
			view = request.getRequestDispatcher("displayScore.jsp");
			request.setAttribute("student", student);
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

