// require hamcrest-all: 1.3
package com.junit4.examples;

import static org.junit.Assert.*;
import org.junit.Test;
// type this import
import static org.hamcrest.Matchers.*;

public class HamcrestAssertions
{
	@Test
	public void test()
	{
		int sum = 2;
		assertThat("sum test", sum, equalTo(2));
		assertThat(sum, is(2));
		assertThat(sum, is(not(3)));
		assertThat(sum, greaterThan(0));
		assertThat(sum, is(greaterThan(1)));
		
		assertThat(2 == 2, is(true));
		
		String str = "White-box testing";
		assertThat(str, containsString("White"));
		assertThat(str, startsWith("White"));
		assertThat(str, endsWith("testing"));
		assertThat(str, equalToIgnoringCase("white-box testing"));
		assertThat(str, not(equalToIgnoringCase("black-box testing")));
		
		String[] cars = {"Ferrari", "Acura", "Lamborgini"};
		String[] myCars = {"Ferrari", "Acura", "Lamborgini"};
		assertArrayEquals(cars, myCars);
	}
}
