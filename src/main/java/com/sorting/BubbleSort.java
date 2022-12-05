package com.sorting;

import java.util.Arrays;

public class BubbleSort implements Sorting {
	
	public static void main(String args[]) {

		int[] arr = new int[] { 5, 8, 2, 6, 12 };

		Sorting sort = new BubbleSort();
		
		sort.sortAscending(arr);
		System.out.println("ascending :"+Arrays.toString(arr));


		sort.sortDescending(arr);
		System.out.println("descending :"+Arrays.toString(arr));


	}

	@Override
	public void sortAscending(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					System.out.println("  0  "+arr[j]+"    1  "+arr[j+1]);
					int temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}

			}
		}
		
		System.out.println("ascending :"+Arrays.toString(arr));

	}

	@Override
	public void sortDescending(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] < arr[j + 1]) {
					int temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}

			}
		}
		
		System.out.println("descending :"+Arrays.toString(arr));

		
		
	}

}
