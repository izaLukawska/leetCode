package LeetCode.Java_Problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//LINK: https://leetcode.com/problems/3sum-closest/submissions/1453668768/

public class LeetCode_16 {
	public int threeSumClosest(int[] nums, int target) {
		Arrays.sort(nums);
		Map<Integer, Integer> sumDiff = new HashMap<>();
		for (int i = 0; i < nums.length - 2; i++) {
			calculateSumDiff(nums, i, target, sumDiff);
		}

		return sumDiff.entrySet().stream().min(Map.Entry.comparingByValue()).get().getKey();
	}

	private static void calculateSumDiff(int[] nums, int index, int target, Map<Integer, Integer> sumDiff) {
		int leftPoint = index + 1;
		int rightPoint = nums.length - 1;

		while (leftPoint < rightPoint) {
			int sum = nums[index] + nums[leftPoint] + nums[rightPoint];
			sumDiff.put(sum, Math.abs(sum - target));
			if (sum < target) {
				leftPoint++;
			} else {
				rightPoint--;
			}
		}
	}
}