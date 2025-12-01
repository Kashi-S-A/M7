package com.ty.obj;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Mobile {

	@Value(value = "Samsung")
	private String brand;

	@Value(value = "60000")
	private double price;

	public void display() {
		System.out.println("Brand : " + brand);
		System.out.println("Price : " + price);
	}

	public void ring() {
		System.out.println("Mobile ringing!!!!!!!!!!!");
	}
}
