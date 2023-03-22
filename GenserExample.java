package com.servin;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class GenserExample extends GenericServlet {

    ServletConfig config = null;
	
	public void init(ServletConfig config) {
		
		this.config = config;
		System.out.println("Servlet is initialised ");
	}
	
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
    	
		res.setContentType("text/html");
		
		PrintWriter out = res.getWriter();
		out.print("<html><body>");
		out.print("<b>Servlet by implementing Servlet Interface </b>");
		out.print("<a href = 'index.html'>Go Back</a>");
		out.print("</body></html>");
	}

	public void destroy() {
		System.out.println("Servlet is destroyed");
	}

}
