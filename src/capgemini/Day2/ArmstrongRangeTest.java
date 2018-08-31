package capgemini.Day2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import capgemini.Day2.java.ArmstrongRange;

class ArmstrongRangeTest {

	@Test
	void test() {
		assertArrayEquals(new int[] {153,370,371,407},ArmstrongRange.findAllArmstrongNumbers(100,1000));
	}

}
