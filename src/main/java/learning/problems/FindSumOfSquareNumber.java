package learning.problems;

public class FindSumOfSquareNumber {
    public int convert(int number) {
       if( isPerfectSquare(number)){
           return 1;
       }
       int count = 0;

//      count = findNearestSquare(number,count);
        count = findNearestSquare1(number,count);


        return count;
    }

    private int findNearestSquare(int number, int count) {
        count++;

        int squareRoot = (int) Math.sqrt(number);

        number = number - squareRoot *squareRoot;
        return  (number == 1) ? count+1 : findNearestSquare(number,count);

    }

    private boolean isPerfectSquare(int i) {

        int squareRoot = (int) Math.sqrt(i);

        return i == squareRoot *squareRoot;
    }

    private int findNearestSquare1(int number, int count) {



        while(number != 1){
            int squareRoot = (int) Math.sqrt(number);

            number = number - squareRoot *squareRoot;
            count++;
        }
        if(number == 1){
            return count+1;
        }

        return count;
    }
}
