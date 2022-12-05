package com.nonlinear.tree.heap;

public class MaxHeapTreeApplication {
	
	public static void main(String[] args) {
//		MAXHeapTree<Integer> heapTree = new MAXHeapTree<>();
		MinHeapTree<Integer> heapTree = new MinHeapTree<>();

		try {
//			heapTree.insert(4);
//			heapTree.insert(5);
//			heapTree.insert(24);
//			heapTree.insert(28);
//			
//			heapTree.insert(33);
//			heapTree.insert(56);
//			heapTree.insert(36);
//			heapTree.insert(89);
//			
//			heapTree.insert(189);
//			heapTree.insert(30);

			heapTree.insert(5);
	        heapTree.insert(3);
	        heapTree.insert(17);
	        heapTree.insert(10);
	        heapTree.insert(84);
	        heapTree.insert(19);
	        heapTree.insert(6);
	        heapTree.insert(22);
	        heapTree.insert(9);
	        heapTree.delete(84);
	        
	        heapTree.insert(2);
	        heapTree.delete(2);
	        heapTree.delete(23);
	        heapTree.insert(1);
	        heapTree.insert(2);

	        heapTree.insert(13);







	      

	        System.out.println(heapTree.peek());
			heapTree.print();

//	        heapTree.delete(84);
//			heapTree.print();





//			189 89 36 56 5 4 33 28 24 30 

			
//			PARENT : 189 LEFT CHILD : 89 RIGHT CHILD :36
//			 PARENT : 89 LEFT CHILD : 56 RIGHT CHILD :5
//			 PARENT : 36 LEFT CHILD : 4 RIGHT CHILD :33
//			 PARENT : 56 LEFT CHILD : 28 RIGHT CHILD :24
//
//			 PARENT : 189 LEFT CHILD : 89 RIGHT CHILD :36
//			 PARENT : 89 LEFT CHILD : 56 RIGHT CHILD :24
//			 PARENT : 36 LEFT CHILD : 5 RIGHT CHILD :33
//			 PARENT : 56 LEFT CHILD : 4 RIGHT CHILD :28

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
