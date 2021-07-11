package test;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DisabledExamples {

	@DisplayName("Positive Test")
	@Disabled
	@Test
	public void test1() {
		assertTrue(StringFunctions.isPalindrome("madam"));
	}
	
	
	@DisplayName("Negative Test")
	@RepeatedTest(2)
	@Test
	public void test2() {
		assertFalse(StringFunctions.isPalindrome("nikunj"));
	}
	
	
	@CustomAnnotation
	public void test3() {
		assertFalse(StringFunctions.isPalindrome("nikunj"));
	}
	
}
