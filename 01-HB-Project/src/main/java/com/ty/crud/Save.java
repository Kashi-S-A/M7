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
		// since all the DML statements are not auto-committing we need manage the
		// transaction and commit the DML operations
		// et.begin(); ==> start transaction
		// et.commit(); ==> commits the transaction.

		Employee employee = new Employee();
		employee.setEid(103);
		employee.setName("Smith");
		employee.setEmail("smith@gmail.com");
		employee.setSalary(40000);

		et.begin();
		em.persist(employee);
		et.commit();

		System.out.println("employee saved");
	}
}
