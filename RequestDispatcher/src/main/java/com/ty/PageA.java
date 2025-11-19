package com.ty;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/page-a")
public class PageA extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Servlet Page-A is triggered");

		PrintWriter pw = resp.getWriter();
		pw.print("<html><body><h1>Welcome to Servlet Page-A</h1></body></html>");

		// to dispatch to servlet
		// enter url of servlet,for html and
		// jsp enter name

		String username = "Allen";
		int age = 23;

		req.setAttribute("un", username);
		req.setAttribute("ua", age);

		User user = new User("Smith", "smith@gmail.com", 876545678);
		req.setAttribute("userDetails", user);

		RequestDispatcher rd = req.getRequestDispatcher("display.jsp");// page-b/register.html/login.jsp
//		rd.include(req, resp);
		rd.forward(req, resp);
	}
}
