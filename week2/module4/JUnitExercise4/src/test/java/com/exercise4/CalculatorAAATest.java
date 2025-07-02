package com.exercise4;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.After;

public class CalculatorAAATest {
	private Calculator c;
	@Before	
	public void arrangeSetup() {
		 c = new Calculator(); //this method runs after every test case.
		System.out.println("Setup method complete.");
		
	}
	
	@After 
	public void assertTeardown() {
		c = null; //this runs after every test case
		System.out.println("Teardown method compelte.");
		
	}

	@Test
	public void test1() {
		assertEquals(11, c.add(5, 6));
		assertEquals(20, c.multiply(10, 2));
		assertEquals(5, c.divide(25, 5));
		assertEquals(6, c.subtract(10, 4));
		
		
	}
	
	@Test
	public void test2() {
		assertNotNull(c);
		
	}

}
