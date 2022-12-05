package com.sorting;

import java.util.Arrays;

public class InsertionSort implements Sorting {
	
	

	@Override
	public void sortAscending(int[] arr) {
		
		for (int i = 1; i < arr.length; i++) {
			int j = i;
			int index = arr[i];
			while (j > 0 && arr[j - 1] > index) {
				arr[j] = arr[j - 1];
				j--;
			}
			arr[j] = index;

		}
		
		

	}

	@Override
	public void sortDescending(int[] arr) {

		for (int i = 1; i < arr.length; i++) {
			int j = i;
			int index = arr[i];
			while (j > 0 && arr[j - 1] < index) {
				arr[j] = arr[j - 1];
				j--;
			}
			arr[j] = index;

		}

	}

	
	public static void main(String[] args) {
		
		


		int[] arr = new int[] { 5, 8, 2, 6, 12 };
		
		Sorting sort = new InsertionSort();
		sort.sortAscending(arr);
		
		sort.sortAscending(arr);
		System.out.println("ascending :"+Arrays.toString(arr));


		sort.sortDescending(arr);
		System.out.println("descending :"+Arrays.toString(arr));


	
		
	}
}
