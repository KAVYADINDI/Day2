package capgemini.Day2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import capgemini.Day2.java.LoginValidation;

class LoginValidationTest {
	@Test
	void test() {
		assertEquals(false,LoginValidation.checkUserIdAndPassword("kavya","123"));
		assertEquals(true,LoginValidation.checkUserIdAndPassword("kavya","111"));
		assertEquals(false,LoginValidation.checkUserIdAndPassword("mahanvi","123"));
		assertEquals(false,LoginValidation.checkUserIdAndPassword("asdfg","12345"));
	}

}
