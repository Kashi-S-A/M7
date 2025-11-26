package com.ty.map;

import java.util.Map;

public class Shop {

	private String name;
	private Map<String, Double> items;

	public void display() {
		System.out.println("Welcome to shope " + name);
		System.out.println("=========Items=======");
		for (Map.Entry<String, Double> item : items.entrySet()) {
			System.out.println(item.getKey() + " ==> " + item.getValue());
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Map<String, Double> getItems() {
		return items;
	}

	public void setItems(Map<String, Double> items) {
		this.items = items;
	}

}
