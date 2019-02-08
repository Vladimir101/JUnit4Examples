package com.junit4.examples;

import org.assertj.core.api.SoftAssertions;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class WorkingWithSoftAssertions
{
	private String[] beatles = { "John Lennon", "Paul  McCartney", "George Harrison", "Ringo Starr" };
	private SoftAssertions softAssertions;

	@Before
	public void setUp()
	{
		softAssertions = new SoftAssertions();
	}

	@Test
	public void test()
	{
		softAssertions.assertThat(beatles).contains("George Harrison");
		softAssertions.assertThat(beatles).contains("Paul  McCartney");
		softAssertions.assertThat(beatles).contains("Tom Cruise");
	}
	
	@After
	public void tearDown()
	{
		softAssertions.assertAll();
	}
}
