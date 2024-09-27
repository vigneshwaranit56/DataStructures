package learning.problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class NthPrime {

	static int[] i ;
	static {
		i[0] = 11;
	}
	
	public static void main(String args[])
{
		
		List<Integer> l = new ArrayList<Integer>();
		
		l.add(20);
		l.add(8);
		l.add(5);
		
	Collections.sort(l);
	
	for (Iterator iterator = l.iterator(); iterator.hasNext();) {
		Integer integer = (Integer) iterator.next();
		System.out.println(integer);
	}

	
		
		

}
	
	public static void main(int args[])
{
		

}
	
	private static void test(String sample) {
		int x=2,b[]= new int[2];
		System.out.println(b[x]);
	}

	private static int getNthPrime(int nth) {
		int num, count, i;
	    num=1;
	    count=0;
	 
	    while (count < nth){
	      num=num+1;
	      for (i = 2; i <= num; i++){
	        if (num % i == 0) {
	          break;
	        }
	      }
	      if ( i == num){
	        count = count+1;
	      }
	    }		
	    return num;
	}
	

}