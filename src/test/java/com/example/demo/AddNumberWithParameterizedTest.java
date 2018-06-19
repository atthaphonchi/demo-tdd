package com.example.demo;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class AddNumberWithParameterizedTest {

	private int operand1;
	private int operand2;
	private double expectedResult;

	public AddNumberWithParameterizedTest(int operand1, int operand2, double expectedResult) {
		super();
		this.operand1 = operand1;
		this.operand2 = operand2;
		this.expectedResult = expectedResult;
	}

	@Parameters
	public static Collection<Object[]> myDate(){
		return Arrays.asList(new Object[][]{
			{1,1,2.0},{2,2,4.0}
		});
	}
	
	@Test
	public void add() {
		AddOperation addOperation = new AddOperation();
		double actualResult = addOperation.calculate(this.operand1, this.operand2);
		assertEquals(this.expectedResult, actualResult, 0.000);
	}

}
