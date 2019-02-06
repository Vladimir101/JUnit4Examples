package com.junit4.examples;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Template
{
	@BeforeClass
	public static void setUpBeforeClass()
	{
	}

	@Before
	public void setUp() throws Exception
	{
	}

	@Test
	public void test()
	{
		fail("Not yet implemented");
	}

	@After
	public void tearDown() throws Exception
	{
	}

	@AfterClass
	public static void tearDownAfterClass()
	{
	}
}
