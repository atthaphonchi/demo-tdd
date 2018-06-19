package com.example.demo;

import java.util.Random;

public class MyRandom {
	
	public MyRandom(Random random) {
		super();
		this.random = random;
	}
	Random random;
	public int generate() {
//		Random random = new Random();
		return this.random.nextInt(10);
	}

}
