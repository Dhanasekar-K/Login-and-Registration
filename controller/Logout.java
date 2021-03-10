package com.fujitsu.loginAndRegister.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Logout
 */
@WebServlet("/Logout")
public class Logout extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  
		PrintWriter out=response.getWriter();
	
	HttpSession session=request.getSession();
	
	session.removeAttribute("user");
	
	session.invalidate();
	
	out.println("you are logged out");
	
	response.sendRedirect("login.jsp");
	
	}

}
