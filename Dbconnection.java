package project;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.*;

class Dbconnection
{
	private static final String url="jdbc:mysql://localhost:3306/bus_reservation";
	private static final String username="root";
	private static final String password="root";
	
	public static Connection getConnection() throws SQLException
	{
		return DriverManager.getConnection(url,username,password);
	}

}

