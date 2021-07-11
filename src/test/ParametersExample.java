package test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;
import java.time.Month;
import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

public class ParametersExample {
	
	@ParameterizedTest
	@ValueSource(strings = {"radar", "madam", "behcs"})
	public void PalindromeCheck(String name) {
		assertTrue(StringFunctions.isPalindrome(name));
	}


	@ParameterizedTest
	@ValueSource(ints = {2, 5, 11, 18})
	public void OddNumberCheck(int num) {
		assertTrue(num%2 !=0);
	}

	
	@ParameterizedTest
	@EnumSource(Month.class)  // passing all 12 months
	void MonthTest(Month month) {
		int monthNumber = month.getValue();
		Assertions.assertTrue(monthNumber >=1 && monthNumber <=12);
	}
	
	@ParameterizedTest
	@EnumSource(value = Month.class, names= {"APRIL", "JUNE", "SEPTEMBER", "NOVEMBER", "DECEMBER"})
	void someMonths_Are30DaysLong(Month month) {
		Assertions.assertEquals(30, month.length(false));
	}
	
	@ParameterizedTest
	@EnumSource(value = Month.class, names = {"FEBRUARY"})
	void leapYearTest(Month month) {
		
		boolean flag = true; // leap year
		Assertions.assertEquals(28, month.length(flag));
	}
	
	@ParameterizedTest
	@CsvSource(value = {"test:test", "Name:name", "java:Java"}, delimiter = ':')
	void toLowerCase_ShouldGenerateTheExpectedLowercaseValue(String expected, String actual) {
		
		Assertions.assertEquals(expected, actual);
	}
	
	@ParameterizedTest
	@MethodSource("DPMethod")
	void MethodSourceExample(String str) {
		
		Assertions.assertNotNull(str);
		Assertions.assertTrue(StringFunctions.isPalindrome(str));
		
	}
		
	static Stream<String> DPMethod() {
		return Stream.of("racecar", "radar", "mom", "dad");
	}
	
	@ParameterizedTest
	// @CsvFileSource(resources = "/csvdata.csv")	    // put source in resources folder of the class
	@CsvFileSource(files = "src/../data/csvdatafile.csv")	    // "files" is used to for file located outside class path
	void toUpperCase_ShouldGenerateTheExpectedUppercaseValueCSVFile(
			String input, String expected) {
		String actualValue = input.toUpperCase();
		Assertions.assertEquals(expected,actualValue);
	}
	
	@ParameterizedTest
	@CsvSource({"2018/12/25,2018", "2019/02/11, 2019"})
	void getYear(
			@ConvertWith(DateConverter.class) LocalDate date, int expected) {
				Assertions.assertEquals(expected, date.getYear());		
			}
			
	
}




