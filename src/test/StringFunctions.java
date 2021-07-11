package test;

public class StringFunctions {

	public static boolean isPalindrome(String str) {
		// pointers pointing to the beginning
		// and end of the string
		
		int i = 0, j= str.length() - 1;
		
		// while there are characters to compare
		while (i < j ) {

			// If there is a mismatch
			if (str.charAt(i) != str.charAt(j))
				return false;
			
			
			// Increment first pointer and decrement the other
			i++;
			j--;
			
		}
		
		// Given string is a palindrome
		return true;
		
	}
	
	
	
}
