package capgemini.Day2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import capgemini.Day2.java.TotalAndAverageMarks;

class TotalAndAverageTest {

	@Test
	void testTotAndAvgOfAllStudents() 
	{
		assertEquals(140,TotalAndAverageMarks.checkTotalOfStudent1(30,45,65));
		assertEquals(46.00,TotalAndAverageMarks.checkAverageOfStudent1(30,45,65));
		assertEquals(170,TotalAndAverageMarks.checkTotalOfStudent2(60,45,65));
		assertEquals(56.00,TotalAndAverageMarks.checkAverageOfStudent2(60,45,65));
		assertEquals(190,TotalAndAverageMarks.checkTotalOfStudent3(50,55,85));
		assertEquals(63,TotalAndAverageMarks.checkAverageOfStudent3(50,55,85));
	}
	@Test
	void testTotAndAvgOnSubjects()
	{
		assertEquals(140,TotalAndAverageMarks.checkTotalOfSubject1(30,60,50));
		assertEquals(46.00,TotalAndAverageMarks.checkAverageOfSubject1(30,60,50));
		assertEquals(165,TotalAndAverageMarks.checkTotalOfSubject2(45,55,65));
		assertEquals(55.00,TotalAndAverageMarks.checkAverageOfSubject2(45,55,65));
		assertEquals(215,TotalAndAverageMarks.checkTotalOfSubject3(65,65,85));
		assertEquals(71.00,TotalAndAverageMarks.checkAverageOfSubject3(65,65,85));
	}

}
