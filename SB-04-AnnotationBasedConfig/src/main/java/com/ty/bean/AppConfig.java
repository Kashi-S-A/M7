package com.ty.bean;

import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.ty.bean")
public class AppConfig {

	@Bean
	public Scanner getScanner() {
		return new Scanner(System.in);
	}

	@Bean
	public Address getAddress() {
		return new Address();
	}
}
