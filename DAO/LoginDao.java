package com.fujitsu.loginAndRegister.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class LoginDao {

	public boolean verifyUserCredentials(String username, String password) 
	{
		String url="jdbc:mysql://localhost:3306/advjava?autoReconnect=true&useSSL=false";
		String db_username="root";
		String db_password="Dhanasekar@1";
		
		Connection con;
		PreparedStatement ps;
		
		String sql="select * from user where userName=? and password=?";
		
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(url,db_username,db_password);
			
			ps = con.prepareStatement(sql);
			ps.setString(1, username);
			ps.setString(2, password);
			
			ResultSet rs=ps.executeQuery();
			
			if(rs.next())
				return true;
		}
		
		catch (Exception e) 
		{
			
			e.printStackTrace();
		}
		
		return false;
	}
}
