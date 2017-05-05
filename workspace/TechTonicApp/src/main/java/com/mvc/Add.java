package com.mvc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Add {
	
	ConnectToDB c = new ConnectToDB();
	Connection con = c.getConnection();
	Statement stmt;
	
	public void AddAppliedUser(int cnt,String uname,String title) throws SQLException
	{
		stmt = con.createStatement();
		
		stmt.executeUpdate("insert into apply values('"+cnt+"','"+uname+"','"+title+"')");
	}
	
	public void AddAppliedUser(int cnt,String date,String title,String desc,String pres) throws SQLException
	{
		
		stmt = con.createStatement();
		
		stmt.executeUpdate("insert into event values('"+cnt+"','"+date+"','"+title+"','"+desc+"','"+pres+"')");
	}
	
	public void AddUser(String email,String uname,String pass,String user) throws SQLException
	{
		
		stmt = con.createStatement();
		
		stmt.executeUpdate("insert into login values('"+email+"','"+uname+"','"+pass+"','"+user+"')");
	}
	
}
