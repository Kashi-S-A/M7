package com.ty.entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Save {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		EmployeeId eid = new EmployeeId();
		eid.setEmail("mangaxyz@gmail.com");
		eid.setPhone(34567543);

		Employee employee = new Employee();
		employee.setName("Manga");
		employee.setEmployeeId(eid);

		et.begin();
		em.persist(employee);
		et.commit();

		System.out.println("saved");
	}
}
