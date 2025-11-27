package com.ty;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

	@Value(value = "Manga") // field injection
	private String name;

	@Value(value = "manga@gmail.com")
	private String email;

	public void study() {
		System.out.println("Student is studying");
	}

	public void display() {
		System.out.println("==========Student===========");
		System.out.println("Name : " + name);
		System.out.println("Email : " + email);
	}
}
