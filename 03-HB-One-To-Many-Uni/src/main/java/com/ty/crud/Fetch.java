package com.ty.crud;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.entity.College;
import com.ty.entity.Student;

public class Fetch {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();

		College college = em.find(College.class, 101);

		if (college != null) {
			System.out.println("=============College==============");
			System.out.println(college.getCid());
			System.out.println(college.getName());
			System.out.println(college.getAddress());

			List<Student> students = college.getStudent();
			System.out.println("==========Students===========");
			for (Student student : students) {
				System.out.println(student.getSid());
				System.out.println(student.getName());
				System.out.println(student.getStd());
				System.out.println("------------------------------");
			}

		} else {
			System.out.println("Not found");
		}
	}
}
