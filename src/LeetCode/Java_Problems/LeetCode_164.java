package LeetCode.Java_Problems;

//LINK: https://leetcode.com/problems/maximum-gap/description/

import java.util.Arrays;

public class LeetCode_164 {
	public int maximumGap(int[] nums) {
		if (nums.length < 2) {
			return 0;
		}
		Arrays.sort(nums);
		int maxGap = nums[1] - nums[0];

		for (int i = 2; i < nums.length; i++) {
			int currGap = nums[i] - nums[i - 1];
			maxGap = Math.max(maxGap, currGap);
		}

		return maxGap;
	}
}