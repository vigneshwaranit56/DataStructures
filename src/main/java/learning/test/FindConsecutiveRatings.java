package learning.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class FindConsecutiveRatings {

	public static void main(String[] args) {

		
		int[] arr = {4,3,5,4,3};
		findConsectiveRatings(Arrays.asList(4,3,5,4,3));
	}

	private static void findConsectiveRatings(List<Integer> ratings) {
		for (int i = 1; i <= ratings.size(); i++) {
			System.out.println(partition(ratings,i));
		}
	}

	public static<T> List<List<T>> partition(List<T> list, int size) {
	    List<List<T>> partitions = new ArrayList<>();

	    if (list.size() == 0) {
	        return partitions;
	    }

	    int length = list.size();

	    int numOfPartitions = length / size + ((length % size == 0) ? 0 : 1);

	    for (int i = 0; i < numOfPartitions; i++) {
	        int from = i * size;
	        int to = Math.min((i * size + size), length);
	        partitions.add(list.subList(from, to));
	    }
	    
	    return partitions;
	}
}
