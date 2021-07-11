package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

import static org.junit.jupiter.api.Assumptions.assumeTrue;
import static org.junit.jupiter.api.Assumptions.assumeFalse;

public class AssertionsExample {

	
	@BeforeAll
	public static void setup() {
		
		System.setProperty("ENV", "DEV");
		// System.setProperty("ENV", "PROD");
		
	}
	
	
	
	@Disabled ("Do not run test 1")
	@Test
	public void test1() {
		
		String expected = "Hi There";
		String actual = "Hello There";
		
		Assertions.assertEquals(expected,actual);
		
		// static assertion, need to import import static org.junit.jupiter.api.Assertions.assertEquals; 
		// Note: this is to show Junit4 vs Junit5 (only Junit5, aka Jupiter got static version)
		// assertEquals(expected, actual);
		
		String[] expectedArray = {"one", "two", "three" };
		String[] resultArray = {"one", "two", "three" };
		
		Assertions.assertArrayEquals(expectedArray, resultArray);
		
		boolean flag = true;
		assertTrue(flag);
		
	}
	

	@DisplayName("Test2: run only ENV is DEV")
	@Test
	public void test2() {
		//assumeTrue("DEV".equals(System.getProperty("ENV")));
		assumeTrue(System.getProperty("ENV").equals("DEV"));

		assertTrue(StringFunctions.isPalindrome("madam"));
		System.out.println("In Test 2");

	}
	
	@Test
	public void test3() {
		assumeTrue("PROD".equals(System.getProperty("ENV")));
		System.out.println("In Test 3");
		assertTrue(StringFunctions.isPalindrome("nikunj"));
		

	}
	
	@Test
	public void test4() {
		assumeFalse(System.getProperty("ENV").equals("FALSE"));
		System.out.println("In Test 4");
		assertFalse(StringFunctions.isPalindrome("nikunj"));
	}	
	
}
