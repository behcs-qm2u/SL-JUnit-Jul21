package test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.chrome.ChromeDriver;

@ExtendWith(ParameterProviderExample.class)
public class ChromeDriverParamterEx {

	@Test
	public void LoginTest(ChromeDriver driver) {
		
		driver.get("https://www.simplilearn.com/");
	}
}
