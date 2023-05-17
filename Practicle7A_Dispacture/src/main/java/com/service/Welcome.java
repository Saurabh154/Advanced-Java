package com.service;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Welcome extends HttpServlet{
	 public void doPost(HttpServletRequest req , HttpServletResponse res) throws IOException, ServletException {
	    	PrintWriter out = res.getWriter();
	    	res.setContentType("text/html");
	    	String name = req.getParameter("uname");
	    	
            out.print("<html><body>");
			
			out.print("<h2><b>Welcome : " + name + "</b></h2>");
			out.print("<a href='UI.html'>GO BACK</a>");	
			
			out.print("</body></html>");
	    }
}
