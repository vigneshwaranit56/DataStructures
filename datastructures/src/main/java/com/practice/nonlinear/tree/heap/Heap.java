package com.practice.nonlinear.tree.heap;

import java.util.ArrayList;

class Heap {
	  void heapify(ArrayList<Integer> hT, int i) {
	    int size = hT.size();
	    int largest = i;
	    int l = 2 * i + 1;
	    int r = 2 * i + 2;
	    if (l < size && hT.get(l) > hT.get(largest))
	      largest = l;
	    if (r < size && hT.get(r) > hT.get(largest))
	      largest = r;

	    if (largest != i) {
	      int temp = hT.get(largest);
	      hT.set(largest, hT.get(i));
	      hT.set(i, temp);

	      heapify(hT, largest);
	    }
	  }

	  void insert(ArrayList<Integer> hT, int newNum) {
	    int size = hT.size();
	    if (size == 0) {
	      hT.add(newNum);
	    } else {
	      hT.add(newNum);
	      for (int i = size / 2 - 1; i >= 0; i--) {
	        heapify(hT, i);
	      }
	    }
	  }

	  void deleteNode(ArrayList<Integer> hT, int num)
	  {
	    int size = hT.size();
	    int i;
	    for (i = 0; i < size; i++)
	    {
	      if (num == hT.get(i))
	        break;
	    }

	    int temp = hT.get(i);
	    hT.set(i, hT.get(size-1));
	    hT.set(size-1, temp);

	    hT.remove(size-1);
	    for (int j = size / 2 - 1; j >= 0; j--)
	    {
	      heapify(hT, j);
	    }
	  }

	  void printArray(ArrayList<Integer> a, int size) {
		  for (int i = 0; i <= a.size() / 2; i++) {
	            System.out.print(
	                " PARENT : " + a.get(i)
	                + " LEFT CHILD : " + a.get(2*i+1)
	                + " RIGHT CHILD :" + a.get(2 * i + 2));
	            System.out.println();
	        }
	  }

	  public static void main(String args[]) {

	    ArrayList<Integer> array = new ArrayList<Integer>();
	    int size = array.size();

	    Heap h = new Heap();
//	    h.insert(array, 3);
//	    h.insert(array, 4);
//	    h.insert(array, 9);
//	    h.insert(array, 5);
//	    h.insert(array, 2);
	    
//	    h.insert(array,4);
//		h.insert(array,5);
//		h.insert(array,24);
//		h.insert(array,28);
//		
//		h.insert(array,33);
//		h.insert(array,56);
//		h.insert(array,36);
//		h.insert(array,89);
//		
//		h.insert(array,189);
//		h.insert(array,30);

	    
	    
	    h.insert(array,5);
        h.insert(array,3);
        h.insert(array,17);
        h.insert(array,10);
        h.insert(array,84);
        h.insert(array,19);
        h.insert(array,6);
        h.insert(array,22);
        h.insert(array,9);

//	    System.out.println("Max-Heap array: ");
//	    h.printArray(array, size);
//
//	    h.deleteNode(array, 4);
//	    System.out.println("After deleting an element: ");
	    h.printArray(array, size);
	  }
	}
