package com.ty;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CollegeApp {

	private String name;
	private String address;

	// constructor injection
	public CollegeApp(@Value(value = "Govt College") String name, @Value(value = "Thane") String address) {
		this.name = name;
		this.address = address;
	}

	public void exams() {
		System.out.println("Conducting exams");
	}

	public void display() {
		System.out.println("========College========");
		System.out.println("Name : " + name);
		System.out.println("Address : " + address);
	}
}
