package capgemini.Day2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import capgemini.Day2.java.Sentence;

class EdittingSentenceTest {
Sentence sentence;
Sentence sentence1;
@BeforeEach
void setup()
{
	sentence  =new Sentence("An    apple a day a keeps a doctor away","a",5);
	sentence1 = new Sentence("haha     ha  hahah","ha",2);
}

	@Test
	void test() {
		assertEquals("An apple a day keeps a doctor away ",sentence.editSentence());
		assertEquals("haha hahah ",sentence1.editSentence());
		
	}

}
