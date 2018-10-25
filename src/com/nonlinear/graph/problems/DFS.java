package com.nonlinear.graph.problems;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class DFS {

    static int maxRegion(int[][] grid) {
    	
    	int max =0;
    	
    	for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {

				if (grid[i][j] == 1) {
					int size = dfs(i, j, grid);
					max = Math.max(max, size);
				}

			}
			System.out.println();
		}
    	
    	
    	System.out.println(max);

        
    	return max;
    }
    

	private static int dfs(int row, int column, int[][] grid) {

		int size = 1;

		if (row < 0 || column < 0 || row >= grid.length || column >= grid[row].length)
			return 0;

		if (grid[row][column] == 0)
			return 0;
		
		grid[row][column] = 0;

		for (int i = row - 1; i <= row + 1; i++) {
			for (int j = column - 1; j <= column + 1; j++) {
				if(i != row || j != column)
				size += dfs(i, j, grid);

			}

		}

		return size;

	}

	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int m = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[][] grid = new int[n][m];

        for (int i = 0; i < n; i++) {
            String[] gridRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < m; j++) {
                int gridItem = Integer.parseInt(gridRowItems[j]);
                grid[i][j] = gridItem;
            }
        }

        int res = maxRegion(grid);

//            bufferedWriter.write(String.valueOf(res));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
}
    }
