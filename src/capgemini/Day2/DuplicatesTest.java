package capgemini.Day2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import capgemini.Day2.java.Duplicates;

class DuplicatesTest {

	@Test
	void test() {
		assertEquals("abcd",Duplicates.deleteDuplicatesInString("aabbccddbcda"));
		assertEquals("prq",Duplicates.deleteDuplicatesInString("pprqrpp rqp qqp"));
		assertEquals("a12b@",Duplicates.deleteDuplicatesInString("aa12212bb12b@1ba"));
	}

}
