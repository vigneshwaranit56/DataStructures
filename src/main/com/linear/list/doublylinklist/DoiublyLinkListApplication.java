package com.practice.linear.list.doublylinklist;

import java.util.HashMap;
import java.util.HashSet;

public class DoiublyLinkListApplication {

	public static void main(String[] args) {
		DoublyLinkList<Integer> dLL = new DoublyLinkList<Integer>();
		dLL.add(1);
		dLL.add(2);
		dLL.add(3);
		dLL.add(4);
		dLL.add(5);
		dLL.print();
		dLL.remove((Object)5);
		dLL.print();
		System.out.println(dLL.isEmpty());
		System.out.println(dLL.contains((Object)2));
		
		HashMap<Integer,Integer> set = new HashMap<Integer,Integer>();
		

	}

}
