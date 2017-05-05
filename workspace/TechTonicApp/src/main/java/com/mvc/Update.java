package com.mvc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Update {

	ConnectToDB c = new ConnectToDB();
	Connection con = c.getConnection();
	Statement stmt;
	
	public void updateEvent(String date,String title,String desc,String pres, String id) throws SQLException
	{
		 stmt = con.createStatement();
		
		stmt.executeUpdate("update event set date='"+date+"',title='"+title+"', descc='"+desc+"', presenter='"+pres+"' where id='"+id+"'");
	}
	
	
}
