package capgemini.Day2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import capgemini.Day2.java.AbsoluteDistancedNumbers;

class AbsoluteDistancedNumberstest {
	AbsoluteDistancedNumbers array;
	@BeforeEach
	void setup()
	{ 
		array = new AbsoluteDistancedNumbers();
		array.setIntegerArray(new int[] {2,3,4,2,1});
		array.setAbsoluteDistance(4);
	}
	@Test
	void test() {
		assertArrayEquals(new int[] {1,4},array.findNumberAtAbsoluteDistance());
	}

}
