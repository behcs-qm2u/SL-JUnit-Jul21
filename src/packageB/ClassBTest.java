package packageB;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class ClassBTest {
	
	@Tag("Sanity")
	@DisplayName("First JUnit in Class B")
	@Test
	public void Test2() {
		
		System.out.println("Inside Test");
	}

}
