package learning.problems;

public class Patterns {

	public static void pattMatt(int[][] var) {

		Integer max = Integer.MIN_VALUE;

		int sum = 0;
		

		for (int i = 0; i <= var.length - 3; i++) {

			for (int j = 0; j <= var[i].length - 3; j++) {

				sum =   var[i][j] + 
						var[i][j + 1] + 
						var[i][j + 2] + 
						var[i + 1][j + 1] +
						var[i + 2][j] +
						var[i + 2][j + 1]+
						var[i + 2][j + 2];
				System.out.println(sum);

				max = Math.max(sum, max);
			}
			System.out.println();

		}

		System.out.println(max);
	}

	public static void main(String[] args) {

			int[][] var = { { 1, 0, 1, 5, 5, 5, 8 }, 
							{ 0, 1, 0, 0, 5, 0, 8 }, 
							{ 1, 1, 1, 5, 5, 5, 4 },
							{ 9, 9, 2, 9, 1, 0, 6 }, 
							{ 0, 9, 9, 5, 0, 0, 5 }, 
							{ 9, 9, 9, 1, 1, 0, 5 },
							{ 9, 9, 9, 1, 1, 0, 5 },
							{ 9, 9, 9, 1, 1, 0, 5 },
							{ 22, 9, 9, 1, 1, 0, 5 } };
		pattMatt(var);
		System.out.println(var.length);
	}
}
