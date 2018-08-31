package capgemini.Day2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import capgemini.Day2.java.NamesCount;

class NamesCountTest {

	@Test
	void test() {
		
		assertEquals("Found name: Sam Occurence: 2",NamesCount.countOfOccurances("Sam"));
		assertEquals("Found name: Ted Occurence: 1",NamesCount.countOfOccurances("Ted"));
		assertEquals("Name not found",NamesCount.countOfOccurances("Tom"));
		assertEquals("Name not found",NamesCount.countOfOccurances("12Sam"));
		
	}

}
