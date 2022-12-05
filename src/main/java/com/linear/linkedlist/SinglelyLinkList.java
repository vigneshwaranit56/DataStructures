package com.linear.linkedlist;

public class SinglelyLinkList implements LinkdedList {

	public Node root;
	public int length = 0;

	@Override
	public void add(Integer n) {
		Node child = new Node(n);
		child.next = root;
		root = child;
		length++;

	}

	@Override
	public void remove(Integer n) {
		if(contains(n)) { // Store head node
	        Node temp = root, prev = null;
	        
	        // If head node itself holds the key to be deleted
	        if (temp != null && temp.data == n)
	        {
	            root = temp.next; // Changed head
	            return;
	        }
	 
	        // Search for the key to be deleted, keep track of the
	        // previous node as we need to change temp.next
	        while (temp != null && temp.data != n)
	        {
	            prev = temp;
	            temp = temp.next;
	        }    
	 
	        // If key was not present in linked list
	        if (temp == null) return;
	 
	        // Unlink the node from linked list
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

			System.out.print(n.data + " ");
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
		list.add(6);
		list.removeAlternate();
		list.print();


	}

	@Override
	public void removeAlternate() {

		Node prev = root;
		
		Node curr = prev.next;
		
		while(curr != null && prev.next != null) {
			
			prev.next = curr.next;
			
			curr = null;
			
			prev = prev.next;
			
			if(prev != null)
				curr = prev.next;
					
		}
	}

	@Override
	public void removeLesserDataneightbour(Integer deleteFriends) {
		
		
		removeLesserDataNeighbour(root,false,deleteFriends,0);


	}

	private void removeLesserDataNeighbour(Node prev, boolean b, Integer deleteFriends, int i) {

		Node curr = prev.next;


		boolean isDelete = false;

		if (curr != null && i != deleteFriends) {

			if (prev.data < curr.data) {
				i++;
				isDelete = true;
				remove(prev.data);

			}

			if (curr != null) {
				prev = curr;
				curr = prev.next;
			}
			
			
			
			removeLesserDataNeighbour(prev, isDelete, deleteFriends, i);

		}
		
		
		

		if (!isDelete)
			remove(prev.data);		
	}

}
