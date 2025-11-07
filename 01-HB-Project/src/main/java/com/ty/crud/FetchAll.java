package com.ty.crud;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.entity.Employee;

public class FetchAll {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();

//		String hql = "select emp from Employee emp";
//
//		Query query = em.createQuery(hql);

		// Index based parameter
//		String hql = "select e from Employee e where e.name=?1 and e.salary=?2";
//		Query query = em.createQuery(hql);
//		query.setParameter(1, "Allen");
//		query.setParameter(2, 50000.0);

		// Naming based parameter
		String hql = "select e from Employee e where e.name=:empName and e.salary=:empSalary";
		Query query = em.createQuery(hql);
		query.setParameter("empName", "Allen");
		query.setParameter("empSalary", 50000.0);

		List<Employee> employees = query.getResultList();

		System.out.println("==========Employee============");
		for (Employee employee : employees) {
			System.out.println(employee.getEid());
			System.out.println(employee.getName());
			System.out.println(employee.getEmail());
			System.out.println(employee.getSalary());
			System.out.println("-------------------------");
		}
	}
}
