package com.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class InfoSort {

	public static void main(String[] args) {

		List<Info> list = new ArrayList<Info>();
		
		list.add(new Info(1, 3));
		list.add(new Info(2, 1));
		System.out.println(list);
		Comparator<Info> compareBy = Comparator.comparing(Info::getB);
		
		list=list.stream().sorted(compareBy.reversed()).collect(Collectors.toList());
		
		System.out.println(list);

		list.stream().map(a -> a.getB()).collect(Collectors.toList()).forEach(System.out::println);;

	}

}
