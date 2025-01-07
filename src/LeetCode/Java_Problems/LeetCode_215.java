package LeetCode.Java_Problems;

//LINK: https://leetcode.com/problems/kth-largest-element-in-an-array/description/

import java.util.Arrays;

public class LeetCode_215 {
	public int findKthLargest(int[] nums, int k) {
		Arrays.sort(nums);
		return nums[nums.length - k];
	}
}