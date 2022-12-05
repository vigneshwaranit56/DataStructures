package com.test;

public class FIndCommonElements {

	public static void main(String[] args) {

		int n[]= {1,3,5,7,9};
				
		int m[]= {2, 3, 4, 5, 6};

		find1(n,m);
	}

	private static void find(int[] n, int[] m) {
		
		
		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < m.length; j++) {
				
				if(n[i] == m[j]) {
					System.out.print(m[i]);
				}
			}
			System.out.println();
		}
	}
	
	private static void find1(int[] n, int[] m) {
	
		
		int onePtr = 0;
		int twoPtr = 0;
		
		while(onePtr < n.length && twoPtr <m.length) {
			
			if(n[onePtr] == m[twoPtr]) {
				System.out.println(n[onePtr]);
				++onePtr;
				++twoPtr;
				continue;
			}
			
			if(n[onePtr] < m[twoPtr]) {
				++onePtr;
				continue;
			}
			
			if(n[onePtr] > m[twoPtr]) {
				++twoPtr;
				continue;
			}
		}
		
		
		
	}


}
