package com.test;

public class TestL2 {

	public static void main(String[] args) {
int[][] arr = null;
int i =1,j = 1;
int x = 3,y = 3;

		TestL2 testL2 = new TestL2();
		testL2.isPathExist(arr,i,j,x,y);
	}

	
	
	private boolean isPathExist(int[][] arr, int i, int j, int x, int y) {
		
		
		for(int k = i;  k < x; k++) {
			
			for(int l = j; l <y; l++) {
				
				if(arr[k][l] == 1) {
					
				}
				
				
			}
			
		}
		
		
		
		
		
		
		return false;
	}

	
	
}
