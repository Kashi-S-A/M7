package com.ty.list;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

	@Value(value = "Manga")
	private String name;

	@Autowired
	private List<String> subjects;

	public void display() {
		System.out.println("name : " + name);
		System.out.println("subjects : " + subjects);
	}
}
