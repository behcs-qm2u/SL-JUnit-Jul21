package test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(EnvCheck.class)

public class ExtensionPointExample {

	@CustomAnnotation
	public void test1() {
		
		assertTrue(StringFunctions.isPalindrome("madam"));
		
		
	}
	
	@DisplayName("EP: Negative Test 2 :-)")
	@RepeatedTest(5)
	@Test
	public void test2() {
		
		
		assertFalse(StringFunctions.isPalindrome("nikunj"));
	}
	
}
