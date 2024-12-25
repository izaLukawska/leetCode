package LeetCode.Java_Problems;

//LINK: https://leetcode.com/problems/maximum-subarray/description/

public class LeetCode_53 {
	public int maxSubArray(int[] nums) {
		int currSum = nums[0];
		int maxSum = nums[0];
		for (int i = 1; i < nums.length; i++) {
			currSum = Math.max(nums[i], currSum + nums[i]);
			maxSum = Math.max(currSum, maxSum);
		}

		return maxSum;
	}
}