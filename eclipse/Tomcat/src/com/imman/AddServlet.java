package com.imman;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



public class AddServlet extends HttpServlet {

	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		int i=Integer.parseInt(req.getParameter("n1"));
		int j=Integer.parseInt(req.getParameter("n2"));
		int k=i+j;
		
		PrintWriter out=res.getWriter();
		out.print("the res-> "+k);
		System.out.println(k);
		
		////		------------------passing Value to servlet using dispatcher--------------------------
		
		
//				req.setAttribute("k", k);
//				
//				RequestDispatcher rd=req.getRequestDispatcher("sq");
//				rd.forward(req, res);
//		
		
////		---------------------Sending value With reqRedirect------------
//		res.sendRedirect("sq?k="+k);
		
		
		
////		-------------------passing Value WithNode session-------------
//		HttpSession session=req.getSession();
//		session.setAttribute("k", k);
		
		
//	----------passing With cookies------------
//			Cookie cookie=new Cookie("k", k+"");
//			res.addCookie(cookie);
//			
//			
//		
//		res.sendRedirect("sq");
	}
}
