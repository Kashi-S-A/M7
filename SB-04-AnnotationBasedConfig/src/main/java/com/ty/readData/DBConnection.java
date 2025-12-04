package com.ty.readData;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DBConnection {

	@Value(value = "${url}")
	private String url;
	
	@Value(value = "${un}")
	private String username;
	
	@Value(value = "${pwd}")
	private String password;

	public void conCreated() {
		System.out.println("Connection created with following data");
		System.out.println(url);
		System.out.println(username);
		System.out.println(password);
	}
}
