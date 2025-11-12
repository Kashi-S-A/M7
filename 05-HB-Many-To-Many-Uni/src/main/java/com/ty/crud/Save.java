package com.ty.crud;

import java.util.Arrays;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.entity.Doctor;
import com.ty.entity.Patient;

public class Save {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Doctor d = new Doctor();
		d.setDid(101);
		d.setName("Stark");
		d.setEmail("stark@gmail.com");
		d.setDegree("MBBS");

		Patient p1 = new Patient();
		p1.setPid(111);
		p1.setName("A");
		p1.setDisease("Cold");

		Patient p2 = new Patient();
		p2.setPid(222);
		p2.setName("B");
		p2.setDisease("Fever");

		Patient p3 = new Patient();
		p3.setPid(333);
		p3.setName("C");
		p3.setDisease("Headache");

		d.setPatients(Arrays.asList(p1, p2, p3));

		et.begin();
		em.persist(d);
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		et.commit();

		System.out.println("saved");

	}
}
