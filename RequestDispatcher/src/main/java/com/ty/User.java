package com.ty;

public class User {

	String name;
	String email;
	long phone;

	public User(String name, String email, long phone) {
		this.name = name;
		this.email = email;
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", phone=" + phone + "]";
	}

}
