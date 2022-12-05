package com.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Singletonclass {

	private static Singletonclass singletonclass;
	
	
	
	public static  Singletonclass getInstance() {
		
		if(singletonclass == null) {
			singletonclass = new Singletonclass();
		}
		
		return singletonclass;
	}
	
	public static void main(String[] args) {
		
		
		printPostiveNumbers(Arrays.asList(-8,20,10,-4,56,-10));
	}

	private static void printPostiveNumbers(List<Integer> asList) {
		
		asList = asList.stream().filter(n -> n>0 ).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		
		asList.forEach(System.out::println);
	}
	
	 // select e.name, max(s.salary) from employee e inner join  salary s on e.id = s.emp_id group by e.id;
}
