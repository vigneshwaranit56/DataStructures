package learning.nonlinear.tree.heap;

public class HeapSort {

	private static final String Ascending = "ascending";
	private static final String Decending = "decending";

	public static void main(String[] args) {
		int[] arr = new int[] { 32, 56, 78, 45, 8, 23, 19 };
		HeapSort.sort(arr, HeapSort.Decending);

		HeapSort.print(arr);
	}

	public static void sort(int[] sarr, String order) {
		int n = sarr.length;
		if (HeapSort.Ascending.equalsIgnoreCase(order)) {
			for (int i = n / 2 - 1; i < sarr.length; i++) {
				maxHeapify(sarr, n, i);
			}
			for (int i = n - 1; i >= 0; i--) {
				System.out.println("sorting");
				int temp = sarr[0];
				sarr[0] = sarr[i];
				sarr[i] = temp;
				maxHeapify(sarr, i, 0);
			}
		} else {
			for (int i = n / 2 - 1; i >= 0; i--) {
				minHeapify(sarr, n, i);
			}
			HeapSort.print(sarr);

			for (int i = sarr.length - 1; i >= 0; i--) {
				System.out.println("sorting");
				int temp = sarr[0];
				sarr[0] = sarr[i];
				sarr[i] = temp;
				minHeapify(sarr, i, 0);
			}
		}

	}

	private static void maxHeapify(int[] sarr, int n, int i) {

		int largest = i;

		int l = 2 * i + 1;

		int r = 2 * i + 2;

		if (l < n && sarr[l] > sarr[largest]) {
			largest = l;
		}

		if (r < n && sarr[r] > sarr[largest]) {
			largest = r;

		}
		if (largest != i) {
			int temp = sarr[i];
			sarr[i] = sarr[largest];
			sarr[largest] = temp;
			maxHeapify(sarr, n, largest);
		}

	}

	private static void minHeapify(int[] arr, int n, int i) {

		int smallest = i;

		int l = 2 * i + 1;

		int r = 2 * i + 2;

		System.out.println(l + " min " + r + " " + i);

		if (l < n && arr[l] < arr[smallest]) {
			smallest = l;
		}

		if (r < n && arr[r] < arr[smallest]) {
			smallest = r;

		}

		if (smallest != i) {
			int temp = arr[i];
			arr[i] = arr[smallest];
			arr[smallest] = temp;
			minHeapify(arr, n, smallest);
		}

//		int smallest = i; // Initialize smalles as root
//		int l = 2 * i + 1; // left = 2*i + 1
//		int r = 2 * i + 2; // right = 2*i + 2
//
//		// If left child is smaller than root
//		if (l < n && arr[l] < arr[smallest])
//			smallest = l;
//
//		// If right child is smaller than smallest so far
//		if (r < n && arr[r] < arr[smallest])
//			smallest = r;
//
//		// If smallest is not root
//		if (smallest != i) {
//			int temp = arr[i];
//			arr[i] = arr[smallest];
//			arr[smallest] = temp;
//
//			// Recursively heapify the affected sub-tree
//			minHeapify(arr, n, smallest);
//		}

	}

	public static void print(int arr[]) {

		int n = arr.length;
		for (int i = 0; i < n; ++i) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

	}

}
