package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class MoveZerosToEnd {

	public static void pushZerosAtEnd(ArrayList<Integer> arr)
	
	{
		int j =arr.size()-1;
		
		for (int i = 0; i <arr.size()/2; i++) {
			
			if(arr.get(j) == 0) {
				j--;
			}else if(arr.get(i) == 0) {
				int temp = arr.get(i);
				arr.set(i, arr.get(j));
				arr.set(j,temp);
				j--;
			}
			
		}
		System.out.println(arr);
		
	}
	
	public static void main(String[] args) {
		
		pushZerosAtEnd( Arrays.asList(2,3,0,5,6,0,5,0).stream().collect(Collectors.toCollection(ArrayList::new)));

		pushZerosAtEnd( Arrays.asList(1, 2, 0, 4, 3, 0, 5, 0).stream().collect(Collectors.toCollection(ArrayList::new)));
	}
	
}
