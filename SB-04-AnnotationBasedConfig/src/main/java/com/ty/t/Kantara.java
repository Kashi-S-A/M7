package com.ty.t;

import org.springframework.stereotype.Component;

@Component
public class Kantara implements Movie {

	@Override
	public void story() {
		System.out.println("A divine story of Deva and Guna");
	}

}
