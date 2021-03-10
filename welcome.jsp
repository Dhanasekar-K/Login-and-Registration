<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome page</title>
</head>
<body>

	<%
	
	response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
	
	if (session.getAttribute("user") == null) 
	{
		response.sendRedirect("login.jsp");
	}
	%>


	<h2>Welcome ${ user }</h2>
	<br>

	<div class="container">

		<a href="welcome.jsp">Home</a><br>
		<br> <a href="about.jsp">About Us!</a><br>
		<br> <a href="admin.jsp">Admin</a><br>
		<br>

	</div>
	<br>
	<br>
	<form action="Logout">
		<input type="submit" value="Logout">
	</form>


</body>
</html>