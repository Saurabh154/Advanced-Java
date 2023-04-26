package com.saurabh;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Print_Table extends HttpServlet{

    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
    	System.out.println("DoPost is initialised");
		res.setContentType("text/html");
		
		PrintWriter out = res.getWriter();
		int num = Integer.parseInt(req.getParameter("number"));
		out.print("<html><body>");
		out.print("<h3><b>Table of Given Number is as follows:</b></h3>");
		for(int i=1;i<=10;i++)
		{
			out.print("<h4> " + num + "*" + i + "=" + num*i +"</h4>");	
		}
		
		out.print("</body></html>");
	}

	public void destroy() {
		System.out.println("DoPost is destroyed");
	}

}
