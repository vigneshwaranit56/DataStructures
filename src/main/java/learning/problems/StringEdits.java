package learning.problems;

public class StringEdits {

	public int countOfEdits(String word1, String word2) {
		int[][] distance = new int[word1.length() + 1][word2.length() + 1];
		for (int i = 0; i < word1.length() + 1; i++)
			for (int j = 0; j < word2.length() + 1; j++)
				distance[i][j] = Integer.MAX_VALUE;
		for (int i = 0; i < word2.length() + 1; i++)
			distance[0][i] = i;
		for (int i = 0; i < word1.length() + 1; i++)
			distance[i][0] = i;
		print(distance);

		for (int i = 0; i < word1.length(); i++) {
			for (int j = 0; j < word2.length(); j++) {
				int min = Math.min(distance[i + 1][j], distance[i][j + 1]) + 1;
				System.out.println(min);
				if (word1.charAt(i) == word2.charAt(j))
					min = Math.min(min, distance[i][j]);
				else
					min = Math.min(min, distance[i][j] + 1);
				distance[i + 1][j + 1] = min;
			}
		}

		print(distance);
		return distance[word1.length()][word2.length()];
	}

	private void print(int[][] distance) {
		for (int i = 0; i < distance.length; i++) {
			for (int j = 0; j < distance[i].length; j++) {
				System.out.print(distance[i][j] + " ");

			}
			System.out.println();
		}
	}

}
