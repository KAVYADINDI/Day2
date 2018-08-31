package capgemini.Day2.java;

public class Duplicates {
	public static String deleteDuplicatesInString(String inputString) {
		String outputString="";
		int n = inputString.length();
		for (int i = 0; i < n; i++) {
			char a = inputString.charAt(i);
			for (int j = i + 1; j < n; j++) {
				if (inputString.charAt(j) == a) {
					char[] array = inputString.toCharArray();
					array[j] = ' ';
					inputString = String.valueOf(array);
				}
			}

		}
		for (int i = 0; i < n; i++) {
			if (inputString.charAt(i) != ' ') {
				outputString+=inputString.charAt(i);
				System.out.println(inputString.charAt(i));
				System.out.println(outputString);
			}
		}
		return outputString;
	}
}
