package com.junit4.examples;

import static org.junit.Assert.*;
//type this import
import static org.hamcrest.Matchers.*;
import org.junit.Before;
import org.junit.Test;

public class TestCalculator
{
	private Calculator calc;
	
	@Before
	public void setUp() 
	{
		calc = new Calculator();
		calc.switchOn();
	}

	@Test
	public void add1plus6()
	{
		calc.add(1);
		calc.add(6);
		assertThat(calc.getResult(), is(7));
	}
	
	@Test
	public void subtract11minus1()
	{
		calc.add(11);
		calc.subtract(1);
		assertThat(calc.getResult(), is(10));
	}
	
	@Test
	public void subtract11minus6()
	{
		calc.add(11);
		calc.subtract(6);
		assertThat(calc.getResult(), is(5));
	}
}
