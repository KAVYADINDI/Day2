package capgemini.Day2;

import static org.junit.jupiter.api.Assertions.*;//Assertions is a class

import org.junit.jupiter.api.Test;

import capgemini.Day2.java.Armstrong;

class ArmstrongTest {

	@Test
	void testCheckArmstrongNumber() {
	assertEquals(true, Armstrong.checkArmstrongNumber(153));
	assertEquals(false, Armstrong.checkArmstrongNumber(145));
	assertEquals(true, Armstrong.checkArmstrongNumber(-153)); 	//use math.absolute to make it positive
	assertEquals(false, Armstrong.checkArmstrongNumber(04567));
	assertEquals(false, Armstrong.checkArmstrongNumber(0x155000));//339
//		assertEquals(false, Armstrong.checkArmstrongNumber('r'));
//		//unicode value is taken - char - 2bytes(536 charecters)
}
}
