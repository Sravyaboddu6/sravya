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
String message = (String)request.getAttribute("error");
if(message!=null){
 out.println("<h2>+message</h2>");
 }
 %>
  <h2>Login Form</h2>
	<form action="LoginServlet" method="post">
	
			<table>
				<center>
				<tr>
					<td>UserName:<input type="text" name="username" /><br />
					</td>
				</tr>
				<tr>
					<td>Password:<input type="password" name="userpass" /><br />
					<br /></td>
				</tr>
				
					<td><input type="submit" value="login" />
				<input type="reset" value="reset" /></td>
				
					</center>
			</table>
	
	</form>
</body>
</html>
</body>
</html>