package learning.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TWOSUM {

	public static void main(String[] args) {

		
		int[] arr = {3,2,4};
//			{2,7,11,15};
		int target = 6;
//		9;
		
//		findTwoSum(arr,target);
		twoSumV2(arr,target);
	}

	public static int[] twoSumV2(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			int differnce = target - nums[i];

			if (map.containsKey(target - nums[i]) && map.get(differnce) != i) {
				System.out.println(i + " " + map.get(differnce));
				return new int[] { map.get(differnce), i };
			} else {
				map.put(nums[i], i);

			}
		}
		return null;
	}
	 public static int[] twoSumV1(int[] nums, int target) {
	        Map<Integer, Integer> map = new HashMap<>();
			
			for (int i = 0; i < nums.length; i++) {
				map.put(nums[i],i);
			}
			
			for (int i = 0; i < nums.length; i++) {
				int differnce = target-nums[i];
				
				
				if(map.containsKey(target-nums[i]) && map.get(differnce) != i  ) {
				
	                return new int[]{i,map.get(differnce)};
				}
			}
	        return null;
	    }
	  public static int[] twoSum(int[] nums, int target) {
	        List<Integer> list = new ArrayList<Integer>();
	        int result[] = new int[2];
			
			for (int i = 0; i < nums.length; i++) {
				list.add(nums[i]);
			}
			for (int i = 0; i < nums.length; i++) {
				
				if(list.contains(target-nums[i]) && list.indexOf(target-nums[i]) != i  ) {
					System.out.println(i+" "+list.indexOf(target-nums[i]));
	                result[0]=i;
	                result[1]=list.indexOf(target-nums[i]);
	                return result;
				}
			}
	        return result;
	    }
	private static void findTwoSum(int[] arr, int target) {
		
		List<Integer> list = new ArrayList<Integer>();
		
		for (int i = 0; i < arr.length; i++) {
			list.add(arr[i]);
		}
		for (int i = 0; i < arr.length; i++) {
			
			if(list.contains(target-arr[i])) {
				System.out.println(i+" "+list.indexOf(target-arr[i]));
				break;
			}
		}
	
		
	}

}
