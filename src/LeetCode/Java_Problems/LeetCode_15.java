package LeetCode.Java_Problems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//LINK: https://leetcode.com/problems/3sum/

public class LeetCode_15 {
	public List<List<Integer>> threeSum(int[] nums) {
		Arrays.sort(nums);
		Set<List<Integer>> result = new HashSet<>();
		for (int i = 0; i < nums.length - 2; i++) {
			checkForThreeSum(nums, i, result);
		}

		return result.stream().toList();
	}

	private static void checkForThreeSum(int[] nums, int index, Set<List<Integer>> result) {
		int leftPointer = index + 1;
		int rightPointer = nums.length - 1;
		while (leftPointer < rightPointer) {
			int sum = nums[index] + nums[leftPointer] + nums[rightPointer];
			if (sum == 0) {
				result.add(Arrays.asList(nums[index], nums[leftPointer], nums[rightPointer]));
				leftPointer++;
				rightPointer--;
			} else if (sum < 0) {
				leftPointer++;
			} else {
				rightPointer--;
			}
		}
	}
}