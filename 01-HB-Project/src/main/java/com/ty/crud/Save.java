package com.ty.crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.entity.Employee;

public class Save {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		// Load the driver and Creating connection,
		// it is responsible to create a table for a entity

		EntityManager em = emf.createEntityManager();
		// Provide methods to perform crud operation
		// persist() ==> save/insert
		// find() ==> fetch
		// merge() ==> update
		// remove() ==> delete

		EntityTransaction et = em.getTransaction();

		Employee employee = new Employee();
		employee.setEid(102);
		employee.setName("Tony");
		employee.setEmail("Tony@gmail.com");
		employee.setSalary(56000);

		et.begin();
		em.persist(employee);
		et.commit();

		System.out.println("employee saved");
	}
}
