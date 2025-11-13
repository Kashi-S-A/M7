package com.ty.crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.entity.College;
import com.ty.entity.Student;

public class FetchByStudent {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();

		Student student = em.find(Student.class, 111);

		if (student != null) {
			System.out.println("========Student============");
			System.out.println(student.getSid());
			System.out.println(student.getName());
			System.out.println(student.getStd());

			College college = student.getCollege();
			System.out.println("=========College===========");
			System.out.println(college.getCid());
			System.out.println(college.getName());
			System.out.println(college.getAddress());

		} else {
			System.out.println("Not found");
		}
	}
}
