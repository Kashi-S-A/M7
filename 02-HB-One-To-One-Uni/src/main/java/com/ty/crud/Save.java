package com.ty.crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.entity.Car;
import com.ty.entity.Engine;

public class Save {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Car car = new Car();
		car.setCid(104);
		car.setBrand("B");
		car.setPrice(1500000);

		Engine engine = new Engine();
		engine.setEid(444);
		engine.setCc(900);

		car.setEngine(engine);

		et.begin();
		em.persist(car);
		et.commit();

		System.out.println("saved");
	}
}
