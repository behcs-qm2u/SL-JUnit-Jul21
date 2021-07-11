package test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestInterfaceImplementation implements TestInterface {


	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("Do nothing. method 1");
	}

	@DisplayName("From TII: test 2")
	@Test
	public void test2() {
		assertTrue(StringFunctions.isPalindrome("madam"));
	}
	
}
