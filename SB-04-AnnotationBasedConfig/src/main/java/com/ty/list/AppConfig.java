package com.ty.list;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "com.ty.list")
public class AppConfig {

	@Bean
	public List<String> getSubjects() {
		return Arrays.asList("JAVA", "SPRING", "HIBERNATE");
	}

	@Bean
	public Map<String, Double> getmMap() {
		Map<String, Double> items = new HashMap<String, Double>();
		items.put("Chocolate", 450.0);
		items.put("Pinapple", 250.0);
		items.put("Red Valvet", 650.0);
		return items;
	}

//	@Bean(value = "laptop") // custom bean id
//	@Scope(value = "prototype") // changing the scope of laptop bean
//	public Laptop getLaptop() {
//		return new Laptop();
//	}
}
