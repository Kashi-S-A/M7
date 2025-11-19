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
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Servlet Page-B is triggered");

		String username = (String) req.getAttribute("un");
		int age = (Integer) req.getAttribute("ua");

		System.out.println(username);
		System.out.println(age);

		User user = (User) req.getAttribute("userDetails");
		System.out.println("==========User===========");
		System.out.println(user.name);
		System.out.println(user.email);
		System.out.println(user.phone);

		PrintWriter pw = resp.getWriter();
		pw.print("<html><body>"
				+ "<h1>" + username + ", Welcome to Servlet Page-B</h1>"
				+ "<h1>User Details</h1>"
				+ "<h3>Name : "+user.name+"</h3>"
				+ "<h3>Email : "+user.email+"</h3>"
				+ "<h3>Phone : "+user.phone+"</h3>"
				+ "</body></html>");
	}
}
