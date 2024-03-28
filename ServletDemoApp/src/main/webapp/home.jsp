<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<p>home page</p>

<% 
pageContext.setAttribute("name", "Femi", PageContext.SESSION_SCOPE);
%>
</body>
</html>