package capgemini.Day2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import capgemini.Day2.java.PalindromeSorting;

class PalindromeDescTest {
	String words[]= {"lolololol","lolol","asf","awsed","lol","ffgf","s","asdf","asdfg","asw"};
	@Test
	void test() {
		assertArrayEquals( new String[] {"lolololol","lolol","lol","s"} ,PalindromeSorting.sorting(words));
	}

}
