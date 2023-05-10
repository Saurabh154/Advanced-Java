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
     public int fact (int n)
     {
	     if(n==0)
	    	 return 1;
	     else
	    	 return fact(n-1)*n;
     }
 %>
 <%
       int n = Integer.parseInt(request.getParameter("numb"));
       out.print("<h2> " + " Factorial of " + n + " is " + fact(n)+"</h2>");
      
    	
 %>
     <a href="fact.html">GO BACK</a>
</body>
</html>