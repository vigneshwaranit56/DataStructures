package learning.nonlinear.tree.heap;

@SuppressWarnings("hiding")
public class MAXHeapTree<Integer> implements TreeI<Integer> {
	private int[] arr;
	private int length;
	private int size;

	public MAXHeapTree() {
		super();
		this.length = 10;
		this.arr = new int[length];
		this.size = 0;
	}

	@Override
	public void insert(Integer t) throws Exception {
		int arrSize = size;
		if (size == length)
			throw new Exception("array reached maximum of is length");
		if (size == 0) {
			arr[size] = (int) t;
		} else {
			arr[size] = (int) t;

			for (int i = arrSize / 2 - 1; i >= 0; i--) {
				heapify(i);
			}

		}
		size++;

	}

	private void heapify(int i) {
		int currLength = size;

		int largest = i;

		int l = 2 * i + 1;

		int r = 2 * i + 2;

		System.out.println(l + " " + r + " " + i);

		if (l < currLength && arr[l] > arr[largest]) {
			largest = l;
		}

		if (r < currLength && arr[r] > arr[largest]) {
			largest = r;

		}

		if (largest != i) {
			int temp = arr[i];
			arr[i] = arr[largest];
			arr[largest] = temp;
			heapify(largest);
		}

	}

	@Override
	public void delete(Integer t) {
		int i;
		for (i = 0; i < size; i++) {
			if ((int) t == arr[i]) {
				break;
			}
		}

		int temp = arr[i];
		arr[i] = arr[size];
		arr[size] = 0;
		System.out.println("b4"+size);
		--size;
		System.out.println("after"+size);


		for (int j = size / 2 - 1; j >= 0; j--) {
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

	public void preOrder() {

	}

	public void inOrder() {

	}

	public void postOrder() {

	}

	public int peek() {

		return arr[0];
	}
}
