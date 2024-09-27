package learning.problems;

import java.util.Set;
import java.util.TreeSet;

public class ChargeBeeHacerEarth {
	
	static class Sequence{
		
	 Set<Integer> treeSet = new TreeSet<Integer>(); 
	 Integer size;
	 Integer dupCount;
	 Integer subseqCount;
		
	}
	
	 Set<Sequence> treeSet = new TreeSet<Sequence>(); 

	public static void sequence(int[] arr) {

		if(arr.length>2) {
			int diff = arr[0]-arr[1];

		for (int i = 0; i < arr.length; i++) {
			

			
			if(i+1 > arr.length)
				break;
			
			
			 Set<Integer> treeSet = new TreeSet<Integer>(); 
			 
			while( i < arr.length &&
					diff == arr[i]-arr[i+1]) {
				
				System.out.println(i);
				treeSet.add(arr[i]);
				
				if(i<arr.length)
				i++;
			}
			
			System.out.println(treeSet);
			if(treeSet.size()>=3) {
				Sequence seq = new Sequence();
				seq.dupCount = 0;
				seq.size = treeSet.size();
				seq.subseqCount =0;
				seq.treeSet.addAll(treeSet);
			}
				
			

			
				diff = arr[i]-arr[i+1];
			
		}
		}else
		{
			System.out.println("no sequnce");
		}
	}

}
