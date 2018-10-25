package com.algorthim.sorting.test;

import org.junit.Test;

import com.algorthim.sorting.BubbleSort;
import com.algorthim.sorting.Sorting;

public class SortingTest {
Sorting sort;
	
	@Test
	public void bubbleSortNegativeTest() {
		
		sort = new BubbleSort();
		
		sort.sortAscending(new int[] {-1,-1,6-30});
		
		sort.sortDescending(new int[] {-1,-1,6-30,89,100});

		
	}
	
}
