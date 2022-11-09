package com.login;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("dbutil")
public class dbutil extends HttpServlet{
	 private static final long serialVersionUID = 1L;
	  
	    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	    	String i=request.getParameter("email");
			String j=request.getParameter("pswd");
			try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Library","root","Immanuvel*27");
			Statement st=con.createStatement();
			st.executeUpdate("create table IF NOT EXISTS user(id int auto_increment,email varchar(30),password varchar(20))");
			st.executeUpdate("insert into user(email,password values(email='"+i+"',password='"+j+"')");
			 st.close();
	            con.close();
			}catch(Exception e) {
				System.out.println(e);
			}
			
	    }
	  
   
}
