package com.nonlinear.tree.heap;

public class MinHeapTree<Integer> implements TreeI<Integer> {

	

    int max = 0;
	private int length;
	private int[] arr;
	private int size;

	public MinHeapTree() {
		super();
		this.length = 10;
		this.arr = new int[length];
		this.size = 0;
	}

	@Override
	public void insert(Integer t) throws Exception {
		int arrSize = size;
		
		if((int)t > max) {
			max = (int)t;
		}
		
		if (size == length )
			throw new Exception("array reached maximum of is length");
		if (size == 0) {
			arr[size] = (int) t;
		} else {
			arr[size] = (int) t;

			for (int i = arrSize / 2 - 1; i >= size; i--) {
				heapify(i);
			}

		}
		size++;

	}

	private void heapify(int i) {
		int currLength = size;

		int smallest = i;

		int l = 2 * i + 1;

		int r = 2 * i + 2;

		System.out.println(l + " " + r + " " + i);

		if (l < currLength &&   arr[l] <arr[smallest]) {
			smallest = l;
		}

		if (r < currLength && arr[r] < arr[smallest]) {
			smallest = r;

		}

		if (smallest != i) {
			int temp = arr[i];
			arr[i] = arr[smallest];
			arr[smallest] = temp;
			heapify(smallest);
		}

	}

	@Override
	public void delete(Integer t) {
		int i;
	    for (i = 0; i < size; i++) {
	    	if((int)t == arr[i]) {
	    		break;
	    	}
	    }

	    int temp = arr[i];
	    arr[i] = arr[size];
	    arr[size] = max+1;
		--size;

	    for (int j = size / 2 - 1; i >= size; i--) {
			heapify(j);
		}

	}

	@Override
	public Boolean search(Integer t) {
		return null;
	}

	@Override
	public void print() {
		
	
		for (int i = 0; i <= size / 2; i++) {
            System.out.print(
                " PARENT : " + arr[i]);
            if(2 * i + 1<size) {
            System.out.print( " LEFT CHILD : " + arr[2 * i + 1]);

            }
            if(2 * i + 2<size) {
        		System.out.print( " RIGHT CHILD :" + arr[2 * i + 2]);

            }
            System.out.println();
        }
	}

	@Override
	public void preOrder() {

	}

	@Override
	public void inOrder() {

	}

	@Override
	public void postOrder() {

	}

	public int peek() {

		return arr[0];
	}

}
