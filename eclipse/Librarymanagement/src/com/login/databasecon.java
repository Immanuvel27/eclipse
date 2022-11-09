package com.login;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



public class databasecon {
 protected static Connection initializeDatabase() 
		 throws SQLException, ClassNotFoundException{
	 Class.forName("com.mysql.cj.jdbc.Driver");
	 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Library","root","Immanuvel*27");
	
	 
	 return con;
 }
}
