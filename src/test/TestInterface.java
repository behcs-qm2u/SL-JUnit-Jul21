package test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public interface TestInterface {

	public void method1();
	
	@DisplayName("Default Test")
	@Test
	default void test1() {
		
		assertTrue(StringFunctions.isPalindrome("madam"));
	}
	
}
