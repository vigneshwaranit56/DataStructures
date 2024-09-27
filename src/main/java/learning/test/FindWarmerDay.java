package learning.test;

public class FindWarmerDay {

	public static void main(String[] args) {
		FindWarmerDay day = new FindWarmerDay();
		day.dailyTemperatures(new int[] { 73, 74, 75, 71, 69, 72, 76, 73 });
//		 73, 74, 75, 71, 69, 72, 76, 73 
	}

	public int[] dailyTemperatures(int[] temperatures) {

		int[] resultArr = new int[temperatures.length];
		for (int i = 0; i < temperatures.length - 1; i++) {

			if (temperatures[i] < temperatures[i + 1]) {
				resultArr[i] = 1;

			} else {
				int nextTemp = i + 1;

				while (nextTemp < temperatures.length - 1) {

					if (temperatures[i] < temperatures[nextTemp]) {
						resultArr[i] = nextTemp - i;
						break;
					} else {
						nextTemp++;
					}

				}

			}

		}
		for (int i = 0; i < temperatures.length; i++) {
			System.out.print(temperatures[i] + " ");
			System.out.print(resultArr[i] + " ");

		}
		System.out.println(resultArr);

		return resultArr;

	}
}
