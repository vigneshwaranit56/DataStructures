package com.test;

public class MergeSort implements Sorting {

	public static void main(String[] args) {
		int arr[] = {7,1,5,3,6,2,2,15,5,3};
		MergeSort mergeSort = new MergeSort();
		mergeSort.sort(arr);
	}

	@Override
	public void sort(int[] arr) {
		int last = arr.length;
//		
		sort(arr,0,last);
		
	}

	private void sort(int[] arr, int l, int r) {
		int middle = arr.length-1/2;

		sort(arr,l,r);
		sort(arr,l+1,r);
		merge(arr,l,middle,r);
	}

	private void merge(int[] arr, int l, int middle, int r) {
		
	}

}
