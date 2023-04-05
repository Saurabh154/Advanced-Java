package com.saurabh;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Average extends HttpServlet{
	 protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
	    	System.out.println("DoPost is initialised");
			res.setContentType("text/html");
			
			PrintWriter out = res.getWriter();
			int a = Integer.parseInt(req.getParameter("1num"));
			int b = Integer.parseInt(req.getParameter("2num"));
			int c = Integer.parseInt(req.getParameter("3num"));
			float avg = (a+b+c)/3;
			out.print("<html><body>");
			
			out.print("<h3><b>Average of 3 Number : " + avg + "</b></h3>");		
			
			out.print("</body></html>");
		}

		public void destroy() {
			System.out.println("DoPost is destroyed");
		}
}
