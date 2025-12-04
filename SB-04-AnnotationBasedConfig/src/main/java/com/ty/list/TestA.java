package com.ty.list;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestA {

	public static void main(String[] args) {
		ConfigurableApplicationContext app = new AnnotationConfigApplicationContext(AppConfig.class);

		Laptop l1 = app.getBean(Laptop.class);
		System.out.println(l1);

		Laptop l2 = app.getBean(Laptop.class);
		System.out.println(l2);

		Laptop l3 = app.getBean(Laptop.class);
		System.out.println(l3);
	}
}
