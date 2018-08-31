package capgemini.Day2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import capgemini.Day2.java.RsultsTest;

class ResultDeclarationTest {

	@Test
	void test() {
		assertEquals(3,RsultsTest.checkResults(67,80,75));
		assertEquals(2,RsultsTest.checkResults(60,80,75));
		assertEquals(2,RsultsTest.checkResults(67,58,75));
		assertEquals(2,RsultsTest.checkResults(67,80,37));
		assertEquals(1,RsultsTest.checkResults(57,58,75));
		assertEquals(1,RsultsTest.checkResults(67,48,57));
		assertEquals(0,RsultsTest.checkResults(55,60,45));
	}

}
