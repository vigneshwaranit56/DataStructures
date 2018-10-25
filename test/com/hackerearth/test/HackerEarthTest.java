package com.hackerearth.test;

import java.util.Scanner;

import org.junit.Test;

import com.problems.ChargeBeeHacerEarth;

public class HackerEarthTest {
	
	@Test
	public void test() {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
					
		}
		
		ChargeBeeHacerEarth.sequence(arr);
		
		sc.close();
	}

}
