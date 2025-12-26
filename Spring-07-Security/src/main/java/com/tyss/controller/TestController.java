package com.tyss.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/register")
	public String reg() {
		return "registered";
	}

	@PostMapping("/greet")
	public String greet() {
		return "Hi Good Morning";
	}

	@GetMapping("/msg")
	public String msg() {
		return "This is msg API";
	}

}
