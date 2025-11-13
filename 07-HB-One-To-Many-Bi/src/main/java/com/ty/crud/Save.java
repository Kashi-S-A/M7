package com.ty.crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.entity.College;
import com.ty.entity.Student;

public class Save {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		College college = new College();
		college.setCid(101);
		college.setName("X");
		college.setAddress("Thane");

		Student s1 = new Student();
		s1.setSid(111);
		s1.setName("A");
		s1.setStd("11th");
		s1.setCollege(college);

		Student s2 = new Student();
		s2.setSid(222);
		s2.setName("B");
		s2.setStd("11th");
		s2.setCollege(college);

		Student s3 = new Student();
		s3.setSid(333);
		s3.setName("C");
		s3.setStd("12th");
		s3.setCollege(college);

		et.begin();
		em.persist(college);
		em.persist(s1);
		em.persist(s2);
		em.persist(s3);
		et.commit();

		System.out.println("saved");
	}
}
