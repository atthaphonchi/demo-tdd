package com.example.demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddNumberTest {
	AddOperation addOperation = new AddOperation();

	@Test
	public void one_add_one_should_return_2() {
		double actualResult = addOperation.calculate(1,1);
		assertEquals(2, actualResult, 0.000);
	}
	
	@Test
	public void two_add_two_should_return_4() {
		double actualResult = addOperation.calculate(2,2);
		assertEquals(4, actualResult, 0.000);
	}

}
