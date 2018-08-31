package capgemini.Day2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import capgemini.Day2.java.Palindrome;

class PalindromeTest {

	@Test
	void test() {
	assertEquals(true,Palindrome.checkIfPalindrome(121));
	assertEquals(false,Palindrome.checkIfPalindrome(-121));
	assertEquals(false,Palindrome.checkIfPalindrome(123));
	assertEquals(true,Palindrome.checkIfPalindrome(1));
	assertEquals(true,Palindrome.checkIfPalindrome(0));
	}
}