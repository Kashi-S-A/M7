package com.ty;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/page-a")
public class PageA extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("This is Servlet PageA");

		resp.getWriter().print("<html><body><h1>Welcome to PageA servlet</h1></body></html>");

		resp.sendRedirect("https://stackoverflow.com/questions");//enter 'page-b' to redirect to PageB Servlet 
																//and  test.jsp to redirect to test.jsp page
	}
}
