package learning.test;

import java.util.Arrays;
import java.util.Iterator;

public class TwoStringsAnagram {

	
	
	
	
	
	
	public static void main(String[] args) {
		
		
		String str1 = "aahbfgh";
		String str2= "hhabaf";
		
		Boolean isAnagram = isAnagram(str1,str2);
		
		System.out.println("Anagram "+isAnagram);
				
//				aahbfgh hhabaf
	}

	private static Boolean isAnagram(String str1, String str2) {
		
		if(str1.length() != str2.length()) {
			System.out.println("string lengths does not match");
			return false;
		}
		

		char[] charArr1 = str1.toCharArray();
		char[] charArr2 = str2.toCharArray();
		
		Arrays.sort(charArr1);
		Arrays.sort(charArr2);
		
        for (int i = 0; i < charArr2.length; i++) {
			
        	if(charArr1[i] == charArr2[i]) {
        		continue;
        	}else {
        		return false;
        	}
		}
		
		return true;
	}
}
