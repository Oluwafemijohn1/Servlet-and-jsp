<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <!-- Directive -->
    <!-- to import packages (Derivative) -->
    <%@ page import="jakarta.servlet.http.HttpServlet, jakarta.servlet.ServletException" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="cyan">
	<%
	/* Scriptlet */
	/* This block is called scriptlet and it goes into service methode in the Servlet class */
	int i = Integer.parseInt(request.getParameter("num1"));
	int j = Integer.parseInt(request.getParameter("num2"));
	int k = i + j;
	
	out.println("Result : " + k);
	
	%>
	
	<%!
	/* Declarative  */
	/* what ever is wrten here will go into the servlet class as a field or a method */
	
	%>
	
	<!-- Expression tag -->
	<%= 4 + 4 %>
</body>
</html>