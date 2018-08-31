package capgemini.Day2.java;

public class Sentence {
	private String sentence;
	private String wordToBeDeleted;
	private int index;

	public Sentence(String sentence, String word, int index) {
		this.sentence = sentence;
		this.wordToBeDeleted = word;
		this.index = index;
	}

	public String editSentence() {
		String[] words = sentence.split(" +");
		sentence = "";
		int length = words.length;
		for (int i = 0; i < length; i++) {
			if (words[i].equals(wordToBeDeleted)) {
				if (i == index - 1) {
					continue;
				}
				sentence += words[i] + " ";
			} else {
				sentence += words[i] + " ";
			}
		}
		return sentence;
	}
}
