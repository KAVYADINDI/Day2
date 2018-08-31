package capgemini.Day2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import capgemini.Day2.java.MultidimenssionalArraySearch;

class MultidimenssionalArrayTest {

	@Test
	void test() {
		int[][] elementArray = { { 3, 4, 6 }, { 56, 34, 23 }, { 1, 11, 15 } };
		assertEquals(true, MultidimenssionalArraySearch.searchforElemnt(elementArray, 3));
		assertEquals(true, MultidimenssionalArraySearch.searchforElemnt(elementArray, 15));
		assertEquals(true, MultidimenssionalArraySearch.searchforElemnt(elementArray, 34));
		assertEquals(false, MultidimenssionalArraySearch.searchforElemnt(elementArray, 78));
		assertEquals(false, MultidimenssionalArraySearch.searchforElemnt(elementArray, 0));
	}

}
