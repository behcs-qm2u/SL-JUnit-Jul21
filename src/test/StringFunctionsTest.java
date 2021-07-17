package test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringFunctionsTest {
	

	@Test
	public void test1() {
		
		assertTrue(StringFunctions.isPalindrome("madam"));
		
	}
	
	@Test
	public void test2() {
		
		assertFalse(StringFunctions.isPalindrome("behcs"));
		
	}


}
