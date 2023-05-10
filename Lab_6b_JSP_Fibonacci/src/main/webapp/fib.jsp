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
    int n;
    int a=0,b=1,temp;
 %>
 
 <%
      n = Integer.parseInt(request.getParameter("numb"));
      out.print("<h3>  Series is : </h3>");
      out.print(a +" "+ b + " " );
      for(int i=0;i<n;i++)
      {
    	  temp = a+b;
    	  out.print(  " "+ temp  );
    	  a = b;
    	  b = temp;
    	  
      }
 %>
    <br><br><a href="fibonacci.html">GO BACK</a>
</body>
</html>