package com.ty.crud;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.entity.Doctor;
import com.ty.entity.Patient;

public class Fetch {
	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();

		Doctor doctor = em.find(Doctor.class, 101);

		if (doctor != null) {
			System.out.println("=====Doctor=====");
			System.out.println(doctor.getDid());
			System.out.println(doctor.getName());
			System.out.println(doctor.getEmail());
			System.out.println(doctor.getDegree());

			System.out.println("=========Patients==========");
			List<Patient> patients = doctor.getPatients();

			for (Patient patient : patients) {
				System.out.println(patient.getPid());
				System.out.println(patient.getName());
				System.out.println(patient.getDisease());
				System.out.println("===================");
			}

		} else {
			System.out.println("Not found");
		}
	}
}
