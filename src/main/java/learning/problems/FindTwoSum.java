package learning.problems;

import java.util.HashMap;
import java.util.Map;

public class FindTwoSum {
    public int[] solution(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();



        for (int i = 0; i < arr.length; i++) {
            int differnce = target-arr[i];


            if(map.containsKey(differnce) && map.get(differnce) != i  ) {

                return new int[]{map.get(differnce),i};
            }else{
                map.put(arr[i],i);

            }
        }
        return null;
    }
}
