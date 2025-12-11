package com.tyss.test.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {

	@PostMapping("/save")
	public String saveStudent() {
		System.out.println("student saved");
		return "saved successfully";
	}

	@GetMapping("/get")
	public String getStudent() {
		System.out.println("student fetched");
		return "Student fetched successfully";
	}

	@DeleteMapping("/delete")
	public String deletStudent() {
		System.out.println("Deleted");
		return "student deleted";
	}

	@PutMapping("/update")
	public String updateStudent() {
		System.out.println("Updated");
		return "student updated";
	}
}