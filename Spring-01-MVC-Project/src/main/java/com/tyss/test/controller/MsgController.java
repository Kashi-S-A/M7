package com.tyss.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.tyss.test.UserDTO;

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
	public String getRegisterPage(Model model) {
		model.addAttribute("dto", new UserDTO());
		return "register.jsp";
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String registerUser(UserDTO dto) {

		System.out.println(dto);

		return "register.jsp";
	}

	@RequestMapping("/data")
	public String sendDataUsindModel(Model model) {

		model.addAttribute("username", "Manga");
		model.addAttribute("userage", 34);

		return "display.jsp";
	}

	@RequestMapping("/send-data")
	public ModelAndView sendDataUsingMAV() {

		ModelAndView mv = new ModelAndView("data.jsp");
//		mv.setViewName("data.jsp");
		mv.addObject("un", "Mangi");
		mv.addObject("ua", 32);

		return mv;
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(HttpServletRequest request, Model model) {

		String username = request.getParameter("un");
		String password = request.getParameter("pwd");

		if (username.equals("admin") && password.equals("admin@123")) {
			// display home page and welcome user
			model.addAttribute("username", username);
			return "home.jsp";
		} else {
			// display login page with error
			model.addAttribute("msg", "Invalid credentials");
			return "login.jsp";
		}
	}

}
