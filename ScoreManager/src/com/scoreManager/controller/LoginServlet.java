package com.scoreManager.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.scoreManager.model.*;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String name;
	private String password;
//	private DataBase dataBase = new DataBase();
	
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		name = request.getParameter("name");
		password = request.getParameter("password");
		Manager manager = new Manager(name, password);
		DataBase dataBase = new DataBase();
		manager = (Manager)dataBase.search(manager, null);
		
		RequestDispatcher view = null;
		if (name.equals(manager.getName()) && password.equals(manager.getPassword())) {
			view = request.getRequestDispatcher("choose.jsp");
		} else {
			view = request.getRequestDispatcher("loginFalse.jsp");
		}
		
		view.forward(request, response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
