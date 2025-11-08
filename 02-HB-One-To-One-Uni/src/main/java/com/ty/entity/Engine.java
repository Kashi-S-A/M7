package com.ty.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Engine {

	@Id
	private int eid;
	private double cc;

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public double getCc() {
		return cc;
	}

	public void setCc(double cc) {
		this.cc = cc;
	}

}
