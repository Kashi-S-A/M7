package com.ty.t;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class Chaava implements Movie {

	@Override
	public void story() {
		System.out.println("Story of Sambhaji Maharaj");
	}

}
