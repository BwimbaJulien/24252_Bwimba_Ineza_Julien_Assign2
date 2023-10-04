package com.service;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Login extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String email = req.getParameter("email");
        String password = req.getParameter("password");
        
        if ("bwimbajulien@gmail.com".equals(email) && "1234".equals(password)) {
            try {
            	HttpSession session = req.getSession(true);
            	session.setAttribute("email", email);
            	res.sendRedirect(req.getContextPath() + "/Admission.html");
            } catch (IOException e) {
                e.printStackTrace();
           }
        } else {
        	PrintWriter showmes = res.getWriter();
			showmes.println("No values");
			
            }
	}
}
