package com.linear.linkedlist;


public class DoublyLinkList implements LinkdedList {

	DNode root;
	int length = 0;

	@Override
	public void add(Integer n) {
		DNode child = new DNode(n);

		child.next = root;


		if (root != null)
			root.prev = child;

		root = child;
		length++;

	}

	@Override
	public void remove(Integer n) {
		if(contains(n)) {

		DNode child = root;
		DNode prev = null;

		if (child != null && child.data == n) {
			root = child.next;
			child.next.prev = null;
		}

		while (child.data != n) {
			prev = child;
			child = child.next;

		}
		length--;
		if (prev != null)
			prev.next = child.next;
		if (child.next != null)
			child.next.prev = prev;
		}else
			System.out.println("--entered element does not contains");

	}

	@Override
	public boolean contains(Integer n) {

		DNode child = root;

		while (child != null) {
			if (child.data == n)
				return true;
			else
				child = child.next;
		}

		return false;
	}

	@Override
	public int size() {
		return length;
	}

	@Override
	public String print() {
		String str = "";
		DNode n = root;
		DNode last = null;
		while (n != null) {
			System.out.println(n.data + " ");
			last =n;
			n = n.next;
		}
		System.out.println();
		while(last != null) {
			str+=str+"";
			System.out.println(last.data+" ");
			last = last.prev;
		}
		
		System.out.println(str);
		
		return str;
	}
	
	public static void main(String args[]) {
		LinkdedList list = new DoublyLinkList();
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		
//		list.remove(8);
//		list.remove(5);
		System.out.println(list.print());


		System.out.println("size ="+list.size());
		
	}

}
