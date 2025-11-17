package com.ty;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/test")
public class PageA extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

		System.out.println("PageA servlet is triggered");

		// PrintWriter used to print the message on the browser.
		PrintWriter pw = res.getWriter();
		pw.print("<html>");
		pw.print("<body>");
		pw.print("<h1>Welcome to Servlet PageA</h1>");
		pw.print("</body>");
		pw.print("</html>");

	}
}