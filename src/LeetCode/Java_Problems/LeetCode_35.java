package LeetCode.Java_Problems;

//LINK: https://leetcode.com/problems/search-insert-position/description/

public class LeetCode_35 {
	public int searchInsert(int[] nums, int target) {
		int start = 0;
		int end = nums.length - 1;
		while (start <= end) {
			int middle = start + (end - start) / 2;
			if (nums[middle] == target) {
				return middle;
			} else if (nums[middle] > target) {
				end = middle - 1;
			} else {
				start = middle + 1;
			}
		}

		return start;
	}
}