<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<%
	    int i = Integer.parseInt(request.getParameter("num1")); 
		int j = Integer.parseInt(request.getParameter("num2")); 
		int k = Integer.parseInt(request.getParameter("num3")); 
		
		out.println("<h1>The Sum is : "+(i+j+k)+"</h1>"); 
		out.println("<h1>The Average is : "+((i+j+k)/3)+"</h1>"); 
		
		//out.print("<h1><a href="sum_avg.html">GO BACK</a></h1>");
	%>
	
	<h1><a href="sum_avg.html">GO BACK</a></h1>
</body>
</html>