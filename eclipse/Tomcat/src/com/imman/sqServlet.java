package com.imman;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.CookieStore;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



public class sqServlet extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
////		--------Dispatcher method------------
//		int k=(int) req.getAttribute("k");
		
		
////		----------------reqRedirect method-------------
//		int k=Integer.parseInt(req.getParameter("k"));
//		k=k*k;
		
////		---------------------Using session method--------------
//		HttpSession session=req.getSession();
//		int k=(int)session.getAttribute("k");
//		k=k*k;
		
//		------------using Cookie method------------
		Cookie cookies[]=req.getCookies();
		int k=0;
		for(Cookie c:cookies) {
			if(c.getName().equals("k")) {
				k=Integer.parseInt(c.getValue());
			}
		}
		k=k*k;
		
		PrintWriter out=res.getWriter();
		out.print("the res-> "+k);
		System.out.println(k);
	}

}
