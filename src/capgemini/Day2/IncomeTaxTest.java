package capgemini.Day2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import capgemini.Day2.java.IncomeTax;

class IncomeTaxTest {

	@Test
	void test() {
		assertEquals(300000,IncomeTax.calculateTaxAmount(1000000));
		assertEquals(100000,IncomeTax.calculateTaxAmount(500000));
		assertEquals(30000,IncomeTax.calculateTaxAmount(300000));
		assertEquals(0,IncomeTax.calculateTaxAmount(180000));
		assertEquals(0,IncomeTax.calculateTaxAmount(50000));
		assertEquals(0,IncomeTax.calculateTaxAmount(04567));
		assertEquals(-1,IncomeTax.calculateTaxAmount(0x155000));
		assertEquals(-1,IncomeTax.calculateTaxAmount(-10000));
		assertEquals(-1,IncomeTax.calculateTaxAmount(5000000));
		}
}