package com.ty;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ConfigurableApplicationContext app = new ClassPathXmlApplicationContext("config.xml");

		Student student = (Student) app.getBean("student");
		student.display();
		student.study();

		Person person = (Person) app.getBean("person");
		person.display();
		person.play();

		CollegeApp collegeApp = (CollegeApp) app.getBean("collegeApp");
		collegeApp.display();
		collegeApp.exams();

		RCB rcb = (RCB) app.getBean("myRCB");
		rcb.play();
	}
}
