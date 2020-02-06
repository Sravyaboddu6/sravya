package com.demo;

import java.io.IOException;
//import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.model.LoginPojo;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

protected void doPost(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {
// PrintWriter out = response.getWriter();
String username = request.getParameter("username");

String password = request.getParameter("userpass");
//RequestDispatcher requestDispatcher=null;
//requestDispatcher = request.getRequestDispatcher("Result1.jsp");
LoginPojo loginpojo=new LoginPojo();
loginpojo.setUserName(username);
loginpojo.setPassword(password);
LoginService loginService = new LoginService();
 loginpojo=loginService.validateLogin(loginpojo);

//request.setAttribute("result", result);
if(loginpojo.getRole()==null)
{

//request.setAttribute("error", "Invalid username/password");
RequestDispatcher requestDispatcher=request.getRequestDispatcher("Login.jsp");
request.setAttribute("error", "Invalid UserName/Password");
requestDispatcher.forward(request, response);
}

/*if (n1.equals("ashwitha") && n2.equals("123")) {
//requestDispatcher=request.getRequestDispatcher("success.html");
request.setAttribute("result","success");
}*/
else
{
RequestDispatcher requestDispatcher=request.getRequestDispatcher("Home.jsp");
request.setAttribute("loginDetails",loginpojo);
requestDispatcher.forward(request, response);
}


}


}

