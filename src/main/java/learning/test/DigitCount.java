package learning.test;

public class DigitCount {

	public static void main(String[] args) {

		DigitCount count = new DigitCount();
		
		
		
		for (int i = 1; i < 200; i++) {
			int number = count.countNumber(i);
			
			if(number == 9) {
				System.out.println(i);

			}
		}
	}

	private int countNumber(int i) {
		int sum = 0 ;
		
		while(i > 0) {
			int q = i % 10;
			sum = sum+q;
			i = i/10;
		}
		
		return sum;
		
	}

}
