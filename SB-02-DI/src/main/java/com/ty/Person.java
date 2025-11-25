package com.ty;

public class Person {

	private String name;
	private int age;

	public void display() {
		System.out.println("======Person Data===========");
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
	}
	
	public Person() {
		System.out.println("Person object is created");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("name is injected");
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		System.out.println("age is injected");
		this.age = age;
	}

}