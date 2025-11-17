package com.ty;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/page-b")
public class PageB extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String un = req.getParameter("username");
		String ue = req.getParameter("useremail");
		long phn = Long.parseLong(req.getParameter("userphone"));
		String pwd = req.getParameter("userpwd");
		
		System.out.println("=============User Data=============");
		System.out.println(un);
		System.out.println(ue);
		System.out.println(phn);
		System.out.println(pwd);
		
		PrintWriter pw = resp.getWriter();
		pw.print("<html>"
				+ "<body>"
				+ "<h1>"+un+" Welcome to WebApp(HttpServlet), your account is registered with email : "+ue+ "</h1>"
				+ "</body>"
				+ "</html>");
	}
}
