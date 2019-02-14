package com.junit4.examples;

import static org.junit.Assert.*;
import org.junit.Test;

public class AssertionsJUnit4
{
	@Test
	public void test()
	{
		String x = "Hello";
		String y = " world";
		assertEquals("Hello world", x + y);
		assertEquals(2, 1 + 1);
		assertEquals(2.0, Math.sqrt(4), 1e-10);
		assertTrue(2 > 1);
		assertFalse(1 > 2);
	}
}
