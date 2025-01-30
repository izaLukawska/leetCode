package LeetCode.Java_Problems;

import java.util.HashMap;
import java.util.Map;

//LINK: https://leetcode.com/problems/contains-duplicate-ii/submissions/1516766591/

public class LeetCode_219 {
	public boolean containsNearbyDuplicate(int[] nums, int k){
		Map<Integer, Integer> numbers = new HashMap<>();

		for(int i = 0; i < nums.length; i++){
			if(numbers.containsKey(nums[i]) && Math.abs(i - numbers.get(nums[i])) <= k){
				return true;
			}
			numbers.put(nums[i], i);
		}

		return false;
	}
}