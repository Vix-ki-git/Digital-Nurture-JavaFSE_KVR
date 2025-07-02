package com.exercise3;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorAssersionsTest {

	@Test
	public void testAssertions() {
		Calculator c1 = new Calculator();
		Calculator c2 = null;
		
		assertEquals(10, c1.multiply(2, 5));
		assertEquals(10, c1.divide(50, 5));
		assertEquals(50, c1.add(10, 40));
		
		assertTrue(c1.greaterThan(5, 3));
		assertFalse(c1.lessThan(5, 3));
		
		assertNull(c2);
		assertNotNull(c1);
	}

}
