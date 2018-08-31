package capgemini.Day2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import capgemini.Day2.java.DoLinearSearch;

class LinearSearchTest {

	@Test
	void test() {
		assertEquals(true,DoLinearSearch.search(5));
		assertEquals(true,DoLinearSearch.search(23));
		assertEquals(false,DoLinearSearch.search(55));
	}

}
