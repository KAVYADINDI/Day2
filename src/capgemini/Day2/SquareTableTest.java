package capgemini.Day2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import capgemini.Day2.java.Square;

class SquareTableTest {

	@Test
	void test() {
     assertEquals(25,Square.checkSquareNumber(5));
     assertEquals(16,Square.checkSquareNumber(-4));
     assertEquals(0,Square.checkSquareNumber(0));
     assertEquals(1369,Square.checkSquareNumber(045));
     assertEquals(144,Square.checkSquareNumber(0xC));
	}

}
