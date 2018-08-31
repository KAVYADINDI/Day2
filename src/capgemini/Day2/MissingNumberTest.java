package capgemini.Day2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import capgemini.Day2.java.MissingNumber;

class MissingNumberTest {

	@Test
	void test() {
		int[] array= {1,3,4,2,0};
		assertEquals(5,MissingNumber.searchForMissingNumber(array,5));
	}

}
