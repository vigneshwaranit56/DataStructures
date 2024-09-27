package learning.linear.array;

import java.util.Arrays;
import java.util.TreeMap;

public class ArrayProblemHackerRank {

    public static long arrayManipulation(int n, int[][] queries) {

        long resultArr[] = new long[n];

        for (int i = 0; i < queries.length; i++) {

            for (int j = queries[i][0] - 1; j <= queries[i][1] - 1; j++) {

                long sum = resultArr[j];

                resultArr[j] = sum + queries[i][2];

            }
        }

        for (int i = 0; i < resultArr.length; i++) {
            System.out.println(" " + resultArr[i] + " ");
        }

        long result = max(resultArr);

        System.out.println("result " + result);
        return result;

    }

    private static boolean isAnagaram(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }


        char[] char1 = s1.toCharArray();
        char[] char2 = s2.toCharArray();


        Arrays.sort(char1);
        Arrays.sort(char2);
        return Arrays.equals(char1, char2);
    }

    private static long max(long[] resultArr) {

        long highest = resultArr[0];
        for (int i = 1; i < resultArr.length; i++) {

            if (resultArr[i] > highest)
                highest = resultArr[i];

        }
        return highest;
    }

    public static int sherlockAndAnagrams(String s) {


        int c = 0;
        //System.out.println(s);
        char[] sa;
        sa = s.toCharArray();

        for (int index = 1; index < sa.length; index++) {
            for (int i = 0; i < sa.length - index + 1; i++) {
                String s1 = s.substring(i, index + i);
                for (int j = i + 1; j < sa.length - index + 1; j++) {
                    String s2 = s.substring(j, index + j);
                    // System.out.println(s1+" "+s2);
                    if (isAnagaram(s1, s2))
                        c++;
                }
            }
        }

        System.out.println(c);


        return c;
    }


    public static int maximumToys(int[] prices, int k) {
        Arrays.sort(prices);

        final int max = k;

        int count = 0;
        int sum = prices[0];

        System.out.println("sum" + sum);
        System.out.println("max" + max);


        for (int i = 1; i <= prices.length; i++) {
            System.out.println("i " + i);
            if (sum <= max) {

                sum += prices[i];
                count++;
            }

        }

        return count;
    }


    public static String isValid(String s) {

        TreeMap<Character, Integer> map = new TreeMap<Character, Integer>();


        for (Character c : s.toCharArray()) {

            if (map.containsKey(c))
                map.put(c, map.get(c) + 1);
            else
                map.put(c, 1);

        }

        TreeMap<Integer, Integer> countWordsMap = new TreeMap<Integer, Integer>();


        for (Integer i : map.values()) {

            if (countWordsMap.containsKey(i))
                countWordsMap.put(i, countWordsMap.get(i) + 1);
            else
                countWordsMap.put(i, 1);

        }

        System.out.println(countWordsMap);

        return "YES";
    }
}
