package capgemini.Day2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import capgemini.Day2.java.DiscountPrice;

class DiscountPriceTest {

	@Test
	void test() {
		assertEquals(227.5,DiscountPrice.priceCalculation(350));
		assertEquals(26,DiscountPrice.priceCalculation(050));
		assertEquals(165.75,DiscountPrice.priceCalculation(0XFF));
		assertEquals(0,DiscountPrice.priceCalculation(0));
		assertEquals(0,DiscountPrice.priceCalculation(-230));
	}

}
