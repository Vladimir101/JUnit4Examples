package com.junit4.examples;

public class Calculator
{
	private int result;

	public void switchOn()
	{
		result = 0;
	}

	public int getResult()
	{
		return result;
	}

	public void add(int n)
	{
		result += n;
	}

	// method contains an intentional error
	public void subtract(int n)
	{
		result -= 1;
	}
	
	public void multiply(int n)
	{
		result *= n;
	}
}
