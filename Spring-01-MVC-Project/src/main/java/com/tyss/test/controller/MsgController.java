package com.tyss.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletRequest;


@Controller
public class MsgController {

	// API's
	@RequestMapping("/msg")
	public String getMessage() {
		System.out.println("Message API is triggered");
		return "message.jsp";
	}
	
	@RequestMapping("/greet")
	public String greet() {
		System.out.println("Hey , Good Afternoon");
		return "greet.jsp";
	}
	
	@RequestMapping("/reg")
	public String getRegisterPage() {
		System.out.println("returning register page");
		return "register.jsp";
	}
	
	@RequestMapping(value = "/register",method = RequestMethod.POST)
	public String registerUser(HttpServletRequest request) {
		String un = request.getParameter("username");
		String ue = request.getParameter("useremail");
		String ph = request.getParameter("phone");
		String pwd = request.getParameter("pwd");
		
		System.out.println(un);
		System.out.println(ue);
		System.out.println(ph);
		System.out.println(pwd);
		
		return "register.jsp";
	}
	
}
