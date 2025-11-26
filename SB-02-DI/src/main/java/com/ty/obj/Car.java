package com.ty.obj;

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

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

}
