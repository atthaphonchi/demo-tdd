package com.example.demo;

import static org.junit.Assert.assertEquals;

import java.util.Random;

import org.junit.Test;

public class MyRandomTest {

	@Test
	public void testRandom() {
		Random random = new Random(){
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public int nextInt(int bound) {
				return 5;
			}
			
		};
		MyRandom myRandom = new MyRandom(random);
		int actualResult = myRandom.generate();
		assertEquals(5, actualResult);
	}
}
