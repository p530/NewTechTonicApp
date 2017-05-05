package com.mvc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectUser {

	ConnectToDB c = new ConnectToDB();
	Connection con = c.getConnection();
	Statement stmt;
	ResultSet rs;
	
	public ResultSet getUser(String email,String pass) throws SQLException
	{
		
		stmt = con.createStatement();
		
		
		rs = stmt.executeQuery("select * from login where email='"+email+"' and pass='"+pass+"'");
		return rs;
	}
	
	public ResultSet getEvent() throws SQLException
	{
		
		stmt = con.createStatement();
		
		
		rs = stmt.executeQuery("select * from event");
		return rs;
	}
	
	public ResultSet getAppliedUser() throws SQLException
	{
		
		stmt = con.createStatement();
		
		
		rs = stmt.executeQuery("select * from apply");
		return rs;
	}
	
	public ResultSet getAppliedUser(String id) throws SQLException
	{
		
		stmt = con.createStatement();
		
		
		rs = stmt.executeQuery("select * from event where id='"+id+"'");
		return rs;
	}
	public ResultSet getUserEmail(String email) throws SQLException
	{
		
		stmt = con.createStatement();
		
		
		rs = stmt.executeQuery("select email from login where email='"+email+"'");
		return rs;
	}
	
	
}
