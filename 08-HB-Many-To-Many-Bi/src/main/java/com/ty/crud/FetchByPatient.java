package com.ty.crud;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.entity.Doctor;
import com.ty.entity.Patient;

public class FetchByPatient {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();

		Patient patient = em.find(Patient.class, 111);

		if (patient != null) {
			System.out.println("=====patient=====");
			System.out.println(patient.getPid());
			System.out.println(patient.getName());
			System.out.println(patient.getDisease());

			System.out.println("=========Doctors==========");
			List<Doctor> doctors = patient.getDoctors();

			for (Doctor doctor : doctors) {
				System.out.println(doctor.getDid());
				System.out.println(doctor.getName());
				System.out.println(doctor.getEmail());
				System.out.println(doctor.getDegree());
				System.out.println("===================");
			}

		} else {
			System.out.println("Not found");
		}
	}
}
