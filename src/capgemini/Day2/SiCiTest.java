package capgemini.Day2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import capgemini.Day2.java.SimpleAndCompoundInterest;

class SiCiTest {

	@Test
	void test() {
		assertArrayEquals(new double[] {7.2, 7.3449554},SimpleAndCompoundInterest.interestCalculation(120,2,3), 0.02);
		assertArrayEquals(new double[] {4.5, 4.5224},SimpleAndCompoundInterest.interestCalculation(150,2,1.5), 0.02);
		
	}

}
