package learning.test;

public class TestM2P {

	public static void main(String[] args) {

		int arr[][] = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
				};
		
		rotateAntiClockwise(arr);
	}

	private static void rotateAntiClockwise(int[][] arr) {
		
		for(int i = arr.length -1; i >= 0; i--) { // 2 1 0
			
			for(int j = 0; j < arr[i].length; j++) { // 0 1 2
				System.out.print(arr[j][i]+" ");
			}
			
			System.out.println();
			
		}
		
	}

}
