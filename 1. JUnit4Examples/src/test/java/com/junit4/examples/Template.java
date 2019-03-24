package com.junit4.examples;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class Template
{
	@BeforeClass
	public static void oneTimeSetUp()
	{
		System.out.println("@BeforeClass - oneTimeSetUp");
	}

	@Before
	public void setUp()
	{
		System.out.println("@Before - setUp");
	}

	@Test
	public void test1()
	{
		System.out.println("test1");
	}

	@Test
	public void test2()
	{
		System.out.println("test2");
	}
	
	@Ignore
	@Test
	public void test3()
	{
		System.out.println("test3");
	}
	
	@After
	public void tearDown()
	{
		System.out.println("@After - tearDown");
	}

	@AfterClass
	public static void oneTimeTearDown()
	{
		System.out.println("@AfterClass - oneTimeTearDown");
	}
}
