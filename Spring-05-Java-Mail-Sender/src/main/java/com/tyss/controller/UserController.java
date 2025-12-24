package com.tyss.controller;

import org.springframework.web.bind.annotation.RestController;

import com.tyss.service.EmailService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class UserController {

	@Autowired
	private EmailService emailService;

	@GetMapping("/send")
	public String sendEmail(@RequestParam String toEmail) {
		String subject = "Welcome to Spring boot batch";
		String body = "Thank you for registering in spring boot batch , enjoy learning!!!!!!!!!!!!!";
		emailService.sendEmail(toEmail, body, subject);
		return "Email Sent";
	}

	@GetMapping("/welcome")
	public String getMethodName(@RequestParam String toEmail, @RequestParam String username) throws Exception {

		String subject = "Welcome to App";
		emailService.sendEmailWithTemplate(toEmail, subject, username);

		return "email sent with template";
	}

}
