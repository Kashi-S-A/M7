package com.ty.obj.cons;

public class Car {

	private String brand;
	private Double price;
	private Engine engine;

	public void display() {
		System.out.println("--------Car--------");
		System.out.println("brand : " + brand);
		System.out.println("price : " + price);
		System.out.println("cc : " + engine.getCc());
		engine.start();
	}

	public Car(String brand, Double price, Engine engine) {
		this.brand = brand;
		this.price = price;
		this.engine = engine;
	}

}
