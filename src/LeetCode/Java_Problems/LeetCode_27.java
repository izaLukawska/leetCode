package LeetCode.Java_Problems;

//https://leetcode.com/problems/remove-element/submissions/1461582127/

public class LeetCode_27 {
	public int removeElement(int[] nums, int val) {
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != val) {
				nums[count] = nums[i];
				count++;
			}
		}
		return count;
	}
}