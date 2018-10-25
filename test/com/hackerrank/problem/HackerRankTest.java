package com.hackerrank.problem;

import java.util.Scanner;

import org.junit.Ignore;
import org.junit.Test;

import com.linear.array.ArrayProblemHackerRank;

public class HackerRankTest {
	
	
    private static final Scanner scanner = new Scanner(System.in);

    @Ignore
	@Test
	public  void test1() {
		
        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        int[][] queries = new int[m][3];

        for (int i = 0; i < m; i++) {
            String[] queriesRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 3; j++) {
                int queriesItem = Integer.parseInt(queriesRowItems[j]);
                queries[i][j] = queriesItem;
            }
        }
		
		ArrayProblemHackerRank.arrayManipulation(n,queries);
		scanner.close();
		
	}
	
    @Ignore
	@Test
	public  void test2() {
		
		int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = ArrayProblemHackerRank.sherlockAndAnagrams(s);

           System.out.println(result);
        }
        
        scanner.close();
		
	}
    
    @Ignore
    @Test
    public void test3() {
    	
    	 String[] nk = scanner.nextLine().split(" ");

         int n = Integer.parseInt(nk[0]);

         int k = Integer.parseInt(nk[1]);

         int[] prices = new int[n];

         String[] pricesItems = scanner.nextLine().split(" ");
         scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

         for (int i = 0; i < n; i++) {
             int pricesItem = Integer.parseInt(pricesItems[i]);
             prices[i] = pricesItem;
         }

         int result = ArrayProblemHackerRank.maximumToys(prices, k);
         System.out.println(result);
         
         scanner.close();
    }
    
    @Test
    public void test4() {
    	 String s = scanner.nextLine();

    	 
         String result = ArrayProblemHackerRank.isValid(s);
         
         System.out.println(" result "+result);
         scanner.close();

    }
    

}
