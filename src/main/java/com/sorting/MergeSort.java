package com.sorting;

import com.test.Sorting;

public class MergeSort implements Sorting {

	public static void main(String[] args) {
		int arr[] = {7,1,5,3,6,2,2,15,5,3};
		MergeSort mergeSort = new MergeSort();
		mergeSort.sort(arr);
	}

	@Override
	public void sort(int[] arr) {
		int last = arr.length-1;
		sort(arr,0,last);
		
	}

	private void sort(int[] arr, int l, int r) {

		if(l<r){
			int middle = l + (r - l) / 2;

			sort(arr,l,middle);
			sort(arr,middle+1,r);
			merge(arr,l,middle,r);
		}

	}

//


	private void merge(int[] arr, int l, int middle, int r) {

		int n1 = middle - l + 1;
		int n2 = r - middle;

		/* Create temp arrays */
		int lArr[] = new int[n1];
		int rArr[] = new int[n2];

		/*Copy data to temp arrays*/
		for (int i = 0; i < n1; ++i)
			lArr[i] = arr[l + i];
		for (int j = 0; j < n2; ++j)
			rArr[j] = arr[middle + 1 + j];

		int i = 0,j =0,k=l;
		/* comparing two arrays with given limit*/
		while(i< lArr.length && j <rArr.length){
			if(lArr[i] <= rArr[j]){
				arr[k] = lArr[i++];
			}else{
				arr[k] = rArr[j++];
			}
			k++;
		}


		while(i < lArr.length){
			arr[k++]=lArr[i++];
		}

		while(j < rArr.length){
			arr[k++]=rArr[j++];
		}

	}

}
