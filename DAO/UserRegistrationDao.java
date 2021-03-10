package com.fujitsu.loginAndRegister.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


import com.fujitsu.loginAndRegister.model.User;

public class UserRegistrationDao {

	public boolean registerUser(User user)
	{
		System.out.println("Start of Dao");
		
		String url="jdbc:mysql://localhost:3306/advjava?autoReconnect=true&useSSL=false";
		String db_username="root";
	    String db_password="Dhanasekar@1";
	    
	    Connection con;
	    PreparedStatement ps;
	    
		String sql="insert into user values(?,?,?,?,?)";
		try 
		
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			 con=DriverManager.getConnection(url,db_username,db_password);
		
			 ps = con.prepareStatement(sql);
				ps.setInt(1, user.getId());
				ps.setString(2, user.getUserName());
				ps.setString(3, user.getPassword());
				ps.setInt(4, user.getMobile());
				ps.setString(5, user.getAddress());
		
				int result=ps.executeUpdate();
				
				if(result>0)
					return true;
				
		
		}
		
		catch (Exception e) 
	   {
			
			e.printStackTrace();
		}
		
		
		System.out.println("End of Dao");
		return false;
	}
	
	
	
}
