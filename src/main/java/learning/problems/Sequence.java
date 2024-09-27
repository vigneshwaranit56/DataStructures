package learning.problems;

import java.util.Scanner;

public class Sequence {

	public static class DNode  {

		DNode prev;
		DNode next;
		Integer data;

		DNode(Integer data){
			this.data = data;
			next = null;
			prev =null;
		}
	}
	
	public static class DoublyLinkList {

		DNode root;
		int length = 0;

		public void add(Integer n) {
			DNode child = new DNode(n);

			child.next = root;


			if (root != null)
				root.prev = child;

			root = child;
			length++;

		}

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

		public int size() {
			return length;
		}

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
				last = last.prev;
			}
			
			
			return str;
		}
		

	}

	public static void main(String[] args) {

		
		Scanner s = new Scanner(System.in);
		
		String str = s.nextLine();
		
		
	String[] strArr = str.split(" ");
	
	System.out.println(strArr.length); 
	int[] intArr = new int[strArr.length];
	for (int i = 0; i < strArr.length; i++) {
		intArr[i] = Integer.parseInt(strArr[i]);
		
	}
	System.out.println();
	
	parseIntArrToList(intArr);
		
		
		s.close();
	}

	private static void parseIntArrToList(int[] intArr) {

		DoublyLinkList doublyLinkList = new DoublyLinkList();
		
		for (int i = 0; i < intArr.length-1; i++) {
			int diff = intArr[i]-intArr[i+1];
			for (int j = 1; j < intArr.length-1; j++) {
				
				if(intArr[i]-intArr[j] == diff)
					doublyLinkList.add(intArr[i]);
				else
					continue;
					
			}
		}
		
		
		doublyLinkList.print();
	}

}
