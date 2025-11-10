package com.ty.crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.entity.Product;
import com.ty.entity.Review;

public class Save {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Product p = new Product();
		p.setName("Samsung S23");
		p.setPid(101);
		p.setPrice(70000);

		Review r1 = new Review();
		r1.setRid(111);
		r1.setMessage("Good phone");
		r1.setProduct(p);

		Review r2 = new Review();
		r2.setRid(222);
		r2.setMessage("Worth for money");
		r2.setProduct(p);

		Review r3 = new Review();
		r3.setRid(333);
		r3.setMessage("Average");
		r3.setProduct(p);

		et.begin();
		em.persist(p);
		em.persist(r1);
		em.persist(r2);
		em.persist(r3);
		et.commit();

		System.out.println("saved");

	}
}
