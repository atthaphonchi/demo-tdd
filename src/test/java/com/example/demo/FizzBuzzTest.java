package com.example.demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest {

	FizzBuzz fizzBuzz = new FizzBuzz();
	
	@Test
	public void inOneOutOneTest() {
		String actualResult = fizzBuzz.fizzBuzz(1);
		assertEquals("1", actualResult);
	}

	@Test
	public void inTwoOutTwoTest() {
		String actualResult = fizzBuzz.fizzBuzz(2);
		assertEquals("2", actualResult);
	}
	@Test
	public void inTreeOutFizzTest() {
		String actualResult = fizzBuzz.fizzBuzz(3);
		assertEquals("Fizz", actualResult);
	}
	@Test
	public void inFourOutFourTest() {
		String actualResult = fizzBuzz.fizzBuzz(4);
		assertEquals("4", actualResult);
	}
	
	@Test
	public void in5OutBuzzTest() {
		String actualResult = fizzBuzz.fizzBuzz(5);
		assertEquals("Buzz", actualResult);
	}
	@Test
	public void inSixOutFizzTest() {
		String actualResult = fizzBuzz.fizzBuzz(6);
		assertEquals("Fizz", actualResult);
	}
	@Test
	public void inSevenOutSevenTest() {
		String actualResult = fizzBuzz.fizzBuzz(7);
		assertEquals("7", actualResult);
	}
	@Test
	public void in8Out8Test() {
		String actualResult = fizzBuzz.fizzBuzz(8);
		assertEquals("8", actualResult);
	}
	@Test
	public void in9OutFizzTest() {
		String actualResult = fizzBuzz.fizzBuzz(9);
		assertEquals("Fizz", actualResult);
	}
	@Test
	public void in10OutBuzzTest() {
		String actualResult = fizzBuzz.fizzBuzz(10);
		assertEquals("Buzz", actualResult);
	}
	
	@Test
	public void in11Out11Test() {
		String actualResult = fizzBuzz.fizzBuzz(11);
		assertEquals("11", actualResult);
	}
	
	@Test
	public void in12OutFizzTest() {
		String actualResult = fizzBuzz.fizzBuzz(12);
		assertEquals("Fizz", actualResult);
	}
	@Test
	public void in13Out13Test() {
		String actualResult = fizzBuzz.fizzBuzz(13);
		assertEquals("13", actualResult);
	}
	@Test
	public void in14Out14Test() {
		String actualResult = fizzBuzz.fizzBuzz(14);
		assertEquals("14", actualResult);
	}
	@Test
	public void in15OutFizzBuzzTest() {
		String actualResult = fizzBuzz.fizzBuzz(15);
		assertEquals("FizzBuzz", actualResult);
	}
}
