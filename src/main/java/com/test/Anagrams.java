package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Anagrams {

	public static void main(String[] args) {
		    Anagrams anagrams = new Anagrams();
		    System.out.println(anagrams.anagrams(new ArrayList<String>(Arrays.asList("cat","act"))));

	}

	private Boolean anagrams(ArrayList<String> arrayList) {
		
		String string1 = arrayList.get(0);
		String string2 = arrayList.get(1);
		if(string1.length() != string2.length()) {
			return false;
		}
		char[] ch1 = string1.toCharArray();
		char[] ch2 = string2.toCharArray();

		
		Arrays.sort(ch1 );
		Arrays.sort(ch2);

		
		
		
		for (int i = 0; i < ch2.length; i++) {
			if(ch1[i] != ch2[i]) {
				return false;
			}
		}
		
		
//		System.out.println(string1+" "+string2);
//		
//		ArrayList<Character> listocCharcters = new ArrayList<Character>();
//		ArrayList<Character> listocCharcters2 = new ArrayList<Character>();
//
//		for (int i = 0; i < string1.length(); i++) {
//			
//			listocCharcters.add(string1.charAt(i));
//		}
//		
//		for (int i = 0; i < string2.length(); i++) {
//			char ch = string2.charAt(i);
//			listocCharcters2.add(ch);
//		}
//		
//		
//		
//		
//		return listocCharcters.isEmpty();
		
		return true;
	}

}
