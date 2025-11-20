package com.ty.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Employee {

	@EmbeddedId
	private EmployeeId employeeId;

	private String name;

	public EmployeeId getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(EmployeeId employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
