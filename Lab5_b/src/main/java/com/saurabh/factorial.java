package com.saurabh;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class factorial extends HttpServlet {
	 protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
	    	System.out.println("DoPost is initialised");
			res.setContentType("text/html");
			
			PrintWriter out = res.getWriter();
			int num = Integer.parseInt(req.getParameter("number"));
			int fact=1;
			out.print("<html><body>");
			for(int i=num;i>0;i--)
			{
				
				fact=fact*i;
			
			}
			out.print("<h2><b>Factorial of Given Number " + num + " is : " + fact +"</b></h2>");
			//out.print("<h4> " + "Factorial is :-" + fact + "</h4>");
			out.print("</body></html>");
		}

		public void destroy() {
			System.out.println("DoPost is destroyed");
		}
}
