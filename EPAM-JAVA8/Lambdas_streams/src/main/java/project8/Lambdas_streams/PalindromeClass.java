package project8.Lambdas_streams;

import java.util.stream.IntStream;

public class PalindromeClass {
	
	public static boolean isPalindrome(String word) {
		String testString=word.replaceAll("\\s+","").toLowerCase();
		return IntStream.range(0,testString.length()/2)
				.noneMatch(i->testString.charAt(i)!=testString.charAt(testString.length()-i-1));
	}
}
