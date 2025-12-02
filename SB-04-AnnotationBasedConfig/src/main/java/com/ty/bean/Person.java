package com.ty.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {

	@Value(value = "Dinga")
	private String name;

	@Autowired
	private Address address;

	public void display() {
		System.out.println("=======Person==========");
		System.out.println("Name : " + name);
		address.add();
	}
}
