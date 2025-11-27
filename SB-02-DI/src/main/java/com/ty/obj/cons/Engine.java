package com.ty.obj.cons;

public class Engine {

	private int cc;

	public Engine(int cc) {
		this.cc = cc;
	}

	public int getCc() {
		return cc;
	}

	public void start() {
		System.out.println("engine started");
	}

}
