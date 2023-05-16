package com.service;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Login extends HttpServlet{
    public void doPost(HttpServletRequest req , HttpServletResponse res) throws IOException, ServletException {
    	res.setContentType("text/html");
    	PrintWriter out = res.getWriter();
    	String name = req.getParameter("uname");
    	String pass = req.getParameter("pwd");
    	
    	if(name.equals("Sistec") && pass.equals("Test"))
    	{
    		RequestDispatcher rd = req.getRequestDispatcher("wel");
    		rd.forward(req, res);
    	}
    	
    	else {
    		String stmt = validate(name , pass);
    		out.print(stmt);
    		RequestDispatcher rd = req.getRequestDispatcher("UI.html");
    		rd.include(req , res);
    		
    	}
    	
    	
    }
    
    public String validate(String name , String pass)
	{
//		if(name.equals("Sistec"))
//		{
//			System.out.print("Invalid Password");
//			return pass.equals("Test");
//		}
//		
//		else 
//		{	
//			System.out.print("Invalid UserName");
//		}
		return null;
		
		//return ;
		
	}
}
