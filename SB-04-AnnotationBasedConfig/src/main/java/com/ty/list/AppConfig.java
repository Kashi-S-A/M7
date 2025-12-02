package com.ty.list;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.ty.list")
public class AppConfig {

	@Bean
	public List<String> getSubjects() {
		return Arrays.asList("JAVA", "SPRING", "HIBERNATE");
	}
}
