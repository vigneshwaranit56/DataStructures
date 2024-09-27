package learning.test;

public class RomanLetterToNumber {
	
	public static final Integer I = 1;
	public static final Integer V = 5;
	public static final Integer X = 10;
	public static final Integer L = 50;
	public static final Integer C = 100;
	public static final Integer D = 500;

	public static final Integer M = 1000;



	public static void main(String[] args) {

		RomanLetterToNumber letterToNumber = new RomanLetterToNumber();
	//	int result = letterToNumber.convertV2("VL");
	//	int result = letterToNumber.convertV2("XII");
	//int result = letterToNumber.convertV2("IXII");
 // 4 int result = letterToNumber.convert("XV");
// 5		XLIX
		int result = letterToNumber.convertV2("CXXX");

		System.out.println(result);
	}

	private int convertV2(String string) {
		int result = 0;
		char[] charArray = string.toUpperCase().toCharArray();

		for (int i = 0; i < charArray.length; i++) {
			int firstChar = convertToNum(charArray[i]);
			if (i + 1 < charArray.length) {

				int secondChar = convertToNum(charArray[i + 1]);

				if (firstChar < secondChar) {
					result += secondChar - firstChar;
					i++;
				} else {
					result += firstChar;
				}
			} else {
				result += firstChar;
			}
		}

		return result;

	}
	private int convertToNum(char i) {
		int result = 0;
		switch (i) {
		case 'X':
			result += X;
			break;

		case 'V':
			result += V;
			break;
			
		case 'I':
			result += I;
			break;
		
		case 'L':
			result += L;
			break;
		case 'C':
			result += C;
			break;
		case 'D':
			result += D;
			break;
		case 'M':
			result += M;
			break;



		}
		return result;
	}
	

	private int convert(String string) {
		int result = 0;
		char[] charArray = string.toUpperCase().toCharArray();
		
		for (int i = 0; i < charArray.length; i++) {
			
			
			if(  i+1 < charArray.length && charArray[i]== 'I' && charArray[i+1]=='X') {
				result += X-I;
				System.out.println(i);
			}else if(  i+1 < charArray.length && charArray[i]== 'I' && charArray[i+1]=='V') {
				result += V-I;
				System.out.println(i);

			}
			
			result = convertToNum(charArray[ i]);
			
			
			
			
		}
		
		
		return result;
	}

}
