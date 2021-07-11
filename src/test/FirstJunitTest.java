package test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FirstJunitTest {
	
	
	@BeforeAll
	public static void beforeAllMethod() {
		System.out.println("Inside before All");
		
	}
	
	
	@BeforeEach
	public void beforeEachMethod() {
		
		System.out.println("Inside before each");
	}
	
	@Test
	public void testcase1() {
		System.out.println("Inside Testcase 1");
		
	}
	
	@AfterEach
	public void afterEachMethod() {
		
		System.out.println("Inside after each");
	}
	

}
