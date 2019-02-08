// add VM argument
// --illegal-access=deny
// in Run configuration in Eclipse for the soft assertions
package com.junit4.examples;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ AssertionsJUnit4.class, 
				WorkingWithSoftAssertions.class })
public class TestSuiteJUnit4
{
}
