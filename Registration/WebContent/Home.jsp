<%@ page import="com.demo.model.LoginPojo" %>

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
LoginPojo loginPojo = (LoginPojo) request.getAttribute("loginDetails");%>
<h3> Welcome <%=loginPojo.getRole() %> , <%=loginPojo.getUserName() %></h3>
</body>
</html>