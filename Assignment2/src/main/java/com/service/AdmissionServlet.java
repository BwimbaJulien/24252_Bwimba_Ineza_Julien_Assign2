package com.service;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.http.HttpRequest;


import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AdmissionServlet extends HttpServlet {
	String email, names;
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		email = req.getParameter("email");
		names = req.getParameter("names");
		
		if(email != null && names != null) {
			PrintWriter showmes = res.getWriter();
			showmes.println("You're logged in Successfully");
			
		}else {
			PrintWriter showmes = res.getWriter();
			showmes.println("Enter your Names and Email");
		}
	}
}
