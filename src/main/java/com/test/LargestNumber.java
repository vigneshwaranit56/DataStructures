package com.test;

import java.util.Arrays;

public class LargestNumber {

	public static void main(String[] args) {
//		Example 1:
//
//			Input: nums = [10,2]
//			Output: "210"
//			Example 2:

//			Input: nums = [3,30,34,5,9]
//			Output: "9534330"

		int[] arr = { 3, -30, 34, 5, 9 };
		findLargestSumofArray(arr);

		
		
		
	}

	private static void findLargestSumofArray(int[] arr) {

		
		int first = arr[0];
		
		for (int i = 1; i < arr.length; i++) {
			
			first = compareAndConcat(first,arr[i]); /// 3,30 => 30,3 
			
		}
		
		
		
		System.out.println(first);
		
		
		
		
		
		
//		int largestSum = Arrays.stream(arr).sum();
//		
//		int largest = 0;
//		for (int i = 0; i < arr.length; i++) {
//
//			int tempLargest = largestSum * arr[i];
//			
//			if(tempLargest >largest) {
//				largest = tempLargest;
//			}
//			
//			
//		}
//		
//		System.out.println(largest);
		

//		for (int i = 0; i < arr.length; i++) {
//			
//			StringBuffer sb = new StringBuffer();
//			sb.append(arr[i]);
//
//			for (int j = 0; j < arr.length; j++) {
//
//				if (i == j)
//					continue;
//
//				sb.append(arr[j]);
//
//			
//			}
//			
//			int tempLargest = Integer.valueOf(sb.toString());
//			System.out.println("temp largest "+tempLargest);
//
//			if (tempLargest > largest) {
//				largest = tempLargest;
//			}
//		}
//		
//		System.out.println(" largest "+largest);


	}

	private static int compareAndConcat(int first, int i) {
		StringBuffer sb = new StringBuffer();
		sb.append(first);
		sb.append(i);
		
		int tempLargest1 = Integer.valueOf(sb.toString());
		
		sb = new StringBuffer();
		sb.append(i);
		sb.append(first);
		int tempLargest2 = Integer.valueOf(sb.toString());

		return Math.max(tempLargest1, tempLargest2);
	}

	

}
