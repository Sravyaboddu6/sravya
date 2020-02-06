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
   //String resultData=(String)request.getAttribute("result");
   //if(resultData.equals("success"))
//   out.println("<h2><font color='green'>Login success</h2>");
//String user=request.getParameter("un");
LoginPojo loginpojo=(LoginPojo)request.getAttribute("loginDetails");
 %>
 <h3>welcome<%=loginpojo.getRole() %>,<%=loginpojo.getUserName() %></h2>
</body>
</html>

