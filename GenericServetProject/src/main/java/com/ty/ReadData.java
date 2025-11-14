package com.ty;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/read")
public class ReadData extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		String un = req.getParameter("username");
		String ue = req.getParameter("useremail");
		long phn = Long.parseLong(req.getParameter("userphone"));
		String pwd = req.getParameter("userpwd");
		
		System.out.println("=============User Data=============");
		System.out.println(un);
		System.out.println(ue);
		System.out.println(phn);
		System.out.println(pwd);
		
		PrintWriter pw = res.getWriter();
		pw.print("<html>"
				+ "<body>"
				+ "<h1>"+un+" Welcome to WebApp, your account is registered with email : "+ue+ "</h1>"
				+ "</body>"
				+ "</html>");

	}

}
