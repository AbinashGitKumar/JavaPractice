package practice.arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * USE HASHMAP
 */
public class TwoSum {

	public static void main(String[] args) {
		int arr[] = { 2, 7, 11, 15 };
		int target = 9;
		System.out.println(twoSum(arr, target));
	}
	

	public static int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		int[] returnArr = null;
		for (int i = 0; i <= nums.length - 1; i++) {
			if (map.containsKey(target - nums[i])) {
				returnArr = new int[] { i, map.get(target - nums[i]) };
			}
			map.put(nums[i], i);
		}
		return returnArr;
	}
	
	
	
}
