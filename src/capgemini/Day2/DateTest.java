package capgemini.Day2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import capgemini.Day2.java.DateFoematChange;

class DateTest {

	@Test
	void test() {
		assertEquals("1/January/1234", DateFoematChange.changeDateFormat("1,1,1234"));
		assertEquals("Invalid Input",DateFoematChange.changeDateFormat("0,1,1234"));
		assertEquals("Invalid Input",DateFoematChange.changeDateFormat("32,12,1234"));
		assertEquals("Invalid Input",DateFoematChange.changeDateFormat("30,14,1234"));
	}

}
