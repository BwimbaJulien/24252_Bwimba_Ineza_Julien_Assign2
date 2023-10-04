package com.service;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class SignUpServlet extends HttpServlet {
	
	String email, password;
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
					
		email = req.getParameter("email");
		password = req.getParameter("password");		
		
		if (email != null && password != null) {			
			res.sendRedirect(req.getContextPath() + "/Login.html");
			
		}else {
			PrintWriter showmes = res.getWriter();
			showmes.println("Enter Values");
			
		}
	}
}
