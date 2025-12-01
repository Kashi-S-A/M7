package com.ty.t;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Theatre {

	@Value(value = "INOX")
	private String name;

	@Value(value = "Thane")
	private String address;

	@Autowired
	private Movie movie;

	public void playMovie() {
		System.out.println("In theatre " + name + ", a movie with story given below" + " is playing at " + address);
		movie.story();
	}
}
