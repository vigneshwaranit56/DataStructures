package com.test;

public class LinkList {
	
	private Node head;

	public static void main(String[] args) {

		LinkList list = new LinkList();
		list.insert(1);
		list.insert(2);
		list.insert(3);

		list.print();
		
	}

	private void print() {
		Node temp = head;
		while(temp != null) {
			System.out.println(temp.data+" ");
			temp= temp.next;
		}
		
	}

	

	private void insert(int i) {
		
		// 1->2->3->
			
		Node newNode = new Node(i);
		
		if(head== null) {
			head= newNode;
			return;
		}
		
		
		
		Node temp = head;

		
		while(temp.next != null) {
			temp = temp.next;

		}
	
		
		temp.next = newNode;
		
	}

}
