package com.ty.list;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Shop {

	@Value(value = "Cake Shop")
	private String name;

	@Autowired
	private Map<String, Double> items;

	public void display() {
		System.out.println("Welcome to shop " + name);
		System.out.println("=========Items=======");
		for (Map.Entry<String, Double> item : items.entrySet()) {
			System.out.println(item.getKey() + " ==> " + item.getValue());
		}
	}

}
