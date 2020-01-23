package com.controller;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Login;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	//private static final long serialVersionUID = 1L;
	String user,pass;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		user=request.getParameter("user");
	pass=request.getParameter("pass");
	Login l=new Login();	
	l.setUsername(user);	
	l.setPassword(pass);	
		request.setAttribute("Model",l);
		boolean status=l.validate();
		if(status)
			request.getRequestDispatcher("success.jsp").forward(request, response);
		else
			request.getRequestDispatcher("error.jsp").forward(request, response);

	}

}
