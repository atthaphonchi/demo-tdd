package com.example.demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class DivideNumberTest {
	DevideOperation operation = new DevideOperation();

	@Test(expected=DivideOperationException.class)
	public void should_throw_exception_with_divided_by_zero() {
		operation.calculate(2,0);
	}
	
	@Test
	public void should_2_divided_by_2_result_with_1(){
		double actualResult = operation.calculate(2, 2);
		assertEquals(1, actualResult, 0.000);
	}

}
