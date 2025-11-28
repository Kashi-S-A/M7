package com.ty;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		ConfigurableApplicationContext cApp = new AnnotationConfigApplicationContext(AppConfig.class);

		Student student = (Student) cApp.getBean("student");
		student.display();

		Person person = cApp.getBean(Person.class);
		person.display();

		College college = cApp.getBean(College.class);
		college.display();
	}
}
