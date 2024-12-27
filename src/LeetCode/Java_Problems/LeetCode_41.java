package LeetCode.Java_Problems;

import java.util.Arrays;

//LINK: https://leetcode.com/problems/first-missing-positive/

public class LeetCode_41 {
	public int firstMissingPositive(int[] nums) {
		int number = 1;
		Arrays.sort(nums);
		for (int num : nums) {
			if (num == number) {
				number++;
			}
			if (num > number) {
				break;
			}
		}
		return number;
	}
}