package test;

import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import static org.junit.jupiter.api.Assertions.*;

public class DynamicTestExample {

	@TestFactory
	public Collection<DynamicTest> method1() {
		

		return Arrays.asList(
				DynamicTest.dynamicTest("Positive Test",
						() -> assertTrue(StringFunctions.isPalindrome("madam"))),
						
				DynamicTest.dynamicTest("Negative Test",
								() -> assertTrue(StringFunctions.isPalindrome("nikunj")))
				);
		
	}
	
}
