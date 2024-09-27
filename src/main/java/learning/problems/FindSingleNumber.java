package learning.problems;

import java.util.HashSet;

public class FindSingleNumber {
    public  int solution(int[] arr) {

        HashSet<Integer> hasSet = new HashSet<Integer>();

        for(int i= 0; i<arr.length; i++) {
            if (hasSet.contains(arr[i])) {
                hasSet.remove(arr[i]);
            }else{
                hasSet.add(arr[i]);
            }
        }
        return hasSet.stream().findFirst().get();
    }
}
