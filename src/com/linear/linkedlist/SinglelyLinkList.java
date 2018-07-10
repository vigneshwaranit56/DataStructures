package com.linear.linkedlist;

public class SinglelyLinkList implements LinkdedList {

	Node root;
	int length = 0;

	@Override
	public void add(Integer n) {
		Node child = new Node(n);
		child.next = root;
		root = child;
		length++;

	}

	@Override
	public void remove(Integer n) {
		if(contains(n)) {

		Node temp = root;
		Node prev = null;

		if (temp != null && temp.data == n) {
			root = temp.next;
		}

		while (temp.data == n) {
			prev = temp;
			temp = temp.next;
		}
		
		length--;
		prev.next = temp.next;
		}else
			System.out.println("--entered element does not contains");
	}

	@Override
	public boolean contains(Integer n) {

		Node child = root;

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
		String values = "";
		Node n = root;
		while (n != null) {
			values+=n.data;

			System.out.println(n.data + " ");
			n = n.next;
		}
		
		return values;
	}

	public static void main(String args[]) {

		LinkdedList list = new SinglelyLinkList();
		list.add(6);
		list.add(3);
		list.add(4);
		list.add(2);
		list.add(7);
		list.add(9);
		list.add(8);
		list.add(5);
		list.print();
		System.out.println(list.size() + " size");
		System.out.println();
		list.remove(10);
		System.out.println(list.contains(10));
		list.print();
		System.out.println(list.size() + " size");

	}

}
