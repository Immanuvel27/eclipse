package com.login;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class login extends HttpServlet{
	 private static final long serialVersionUID = 1L;
	public void service(HttpServletRequest req, HttpServletResponse res)throws IOException, ServletException{
		String i=req.getParameter("email");
		String j=req.getParameter("pswd");
		
		PrintWriter out=res.getWriter();
		//out.print(i);
	//	out.print("hii "+j);
	if((i.equals("immanuvelmunnar@gmail.com") && j.equals("imman@123"))||(i.equals("nibila@gmail.com")&&j.equals("nibila"))) {
			res.sendRedirect("Dashboard.html");
	
		}else {
			res.sendRedirect("Index.html");
		}
		
	

	}
}
