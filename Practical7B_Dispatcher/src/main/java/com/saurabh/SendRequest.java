package com.saurabh;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SendRequest extends HttpServlet{
	 public void doPost(HttpServletRequest req , HttpServletResponse res) throws IOException, ServletException {
	    String s = req.getParameter("search");
	    res.sendRedirect("https://www.google.com/search?q=" + s);
	 }
	 
}
