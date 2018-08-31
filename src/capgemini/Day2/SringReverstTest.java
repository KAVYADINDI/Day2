package capgemini.Day2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import capgemini.Day2.java.StringReverse;

class SringReverstTest {

	@Test
	void test() {
		assertEquals("ih !olleh ",StringReverse.reversing("hi hello! "));
		assertEquals("3210 7654  987 ",StringReverse.reversing("0123 4567  789"));
		assertEquals("nA elppa a yad speek a rotcod yawa ",StringReverse.reversing("An apple a day keeps a doctor away"));
	}
}
