package com.algorthim.sorting;

import java.util.Arrays;

public class BucketSort implements Sorting {

	@Override
	public void sortAscending(int[] arr) {
		
		int max = maxVal(arr);
		int bucket[] = new int[max + 1];
		int sortOrder[] = new int[arr.length];

		for (int i = 0; i < arr.length; i++)
			bucket[arr[i]]++;

		int pos = 0;
		for (int i = 0; i < bucket.length; i++) {
			for (int j = 0; j < bucket[i]; j++) {
				sortOrder[pos++] = i;

			}
		}

	

		System.out.println(Arrays.toString(sortOrder));
		
		
	}

	@Override
	public void sortDescending(int[] arr) {
		int max = maxVal(arr);
		int bucket[] = new int[max + 1];
		int sortOrder[] = new int[arr.length];

		for (int i = 0; i < arr.length; i++)
			bucket[arr[i]]++;

		int pos = 0;
		for (int i = 0; i < bucket.length; i++) {
			for (int j = 0; j < bucket[i]; j++) {
				sortOrder[pos++] = i;

			}
		}

	}
	
	public int maxVal(int arr[]) {
		int max = arr[0];

		for (int i = 1; i < arr.length; i++)
			if (arr[i] > max)
				max = arr[i];

		return max;
	}

	public static void main(String[] args) {
		
		int[] arr = new int[] { 5, 8, 2, 6, 12 };


		Sorting sorting = new BucketSort();
		sorting.sortAscending(arr);
		
	}

}
