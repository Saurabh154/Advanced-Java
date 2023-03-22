package com.servlet_interface;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Servlin_Example extends HttpServlet {
	 ServletConfig config = null;
		
		public void init(ServletConfig config) {
			
			this.config = config;
			System.out.println("Servlet is initialised ");
		}
		
	    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
	    	
			res.setContentType("text/html");
			
			PrintWriter out = res.getWriter();
			out.print("<html><body>");
			out.print("<b>Servlet by implementing by Http Servlet class </b>");
			out.print("</body></html>");
		}

		public void destroy() {
			System.out.println("Servlet is destroyed");
		}
}
