package com.linear.linkedlist.problems;

import com.linear.linkedlist.LinkdedList;
import com.linear.linkedlist.SinglelyLinkList;

import java.util.Scanner;

public class DeleteFriend {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Integer t = sc.nextInt();
//		
//
		for (int i = 0; i < t; i++) {
			String friends = sc.nextLine();
//			System.out.println(" no of friends and remove friends"+friends);
			
			String[] friendsAndDelete = friends.split(" ");
			
//			Integer noOfFriends = Integer.parseInt(friendsAndDelete[0]);
			Integer deleteFriends = Integer.parseInt(friendsAndDelete[1]);
			
			String dataOfFriends = sc.nextLine();
			
			String[] friendsArr = dataOfFriends.split(" ");
			
			removeFriends(friendsArr,deleteFriends);
			
			
			
			
/**
 * 3
3 1
3 100 1
5 2
19 12 3 4 17
5 3
23 45 11 77 18
 */
			
		}
		
		
		sc.close();
	}

	private static void removeFriends(String[] friendsArr, Integer deleteFriends) {
		
		LinkdedList list = new SinglelyLinkList();
		
		
		for (int i = friendsArr.length -1; i>=0; i--) {
			
			list.add(Integer.parseInt(friendsArr[i]));
			
		}
		list.removeLesserDataneightbour(deleteFriends);
		list.print();
		
	}

}
