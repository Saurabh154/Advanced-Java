<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%!
		int i=10;  //declartion of variable
		
		public int add()
		{
			i=i+10;
			return i;
		}
	%>
	<%
		out.println("<h1>Value of i = "+i+"</h1>"); //printing the variable
		out.print("<h1> Now value of i = "+add()+"</h1>");
	%>
</body>
</html>