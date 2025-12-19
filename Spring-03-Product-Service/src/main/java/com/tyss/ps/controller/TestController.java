package com.tyss.ps.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestController {

	@GetMapping("/test")
	public String getMethodName() {
		int a = 10/0;
		return "fkjdhsafjkdl";
	}
	
}
