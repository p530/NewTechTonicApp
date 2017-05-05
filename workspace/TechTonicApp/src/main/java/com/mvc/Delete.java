package com.mvc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Delete {

	ConnectToDB c = new ConnectToDB();
	Connection con = c.getConnection();
	Statement stmt;
	
	public void removeEvent(String id) throws SQLException
	{
		stmt = con.createStatement();
		
		
		stmt.execute("delete from event where id='"+id+"'");

	}
	
}
