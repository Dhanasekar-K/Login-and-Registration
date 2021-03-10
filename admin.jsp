<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html>

<body>

	<%
	if (session.getAttribute("user") == null)
	{
		response.sendRedirect("login.jsp");
	}
	%>

	<h3>This is ADMIN module</h3>
	
	<%

String sql="select * from user";

Class.forName("com.mysql.cj.jdbc.Driver");

 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/advjava", "root", "Dhanasekar@1");

Statement stmt = con.createStatement();

ResultSet rs= stmt.executeQuery(sql);

while(rs.next())
out.println("Id:" + rs.getString(1)+"<br>" + " " + "Username:" + rs.getString(2)+"<br>" + " " + "Password:"
		+ rs.getString(3)+"<br>" + " " + "Mobile:" + rs.getString(4)+"<br>" + " " + "Address:" + rs.getString(5)+"<br><br><br>");
%>





</body>
</html>