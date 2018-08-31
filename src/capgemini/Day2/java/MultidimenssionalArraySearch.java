package capgemini.Day2.java;

public class MultidimenssionalArraySearch {

	public static boolean searchforElemnt(int[][] elementArray, int numberToBeSearched) {
		for (int i = 0; i < elementArray.length; i++) {
			for (int j = 0; j < elementArray[i].length; j++) {
				if (elementArray[i][j] == numberToBeSearched) {
					System.out.println("The number is found at " + i + "-" + j);
					return true;
				}
			}
		}
		return false;
	}

}
