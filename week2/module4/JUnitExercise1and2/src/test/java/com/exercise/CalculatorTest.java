package com.exercise;

import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest {

	@Test
	public void test() {
		Calculator c = new Calculator();
		assertEquals(5, c.add(3,  2));
		assertEquals(6, c.add(-3, 9 ));
		assertEquals(8, c.subtract(12, 4));
	}
	

}
