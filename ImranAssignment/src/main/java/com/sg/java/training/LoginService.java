package com.sg.java.training;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class LoginService extends HttpServlet {
	 public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
			String username = request.getParameter("username");
	        String password = request.getParameter("password");
	        String validUsername = "tauhid";
	        String validPassword = "123";
//	        PrintWriter out = new PrintWriter(System.out);
	        if (username.equals(validUsername) && password.equals(validPassword)) {
	            response.sendRedirect("https://www.google.com/");
	        } else {
	        	response.sendRedirect("error.jsp");
	        }
		}
	
}
