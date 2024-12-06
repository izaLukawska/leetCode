package LeetCode.Java_Problems;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//LINK: //LINK: https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/

public class LeetCode_34 {
	public int[] searchRange(int[] nums, int target) {
		List<Integer> indexes = new ArrayList<>();
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == target) {
				indexes.add(i);
			}
		}

		return indexes.isEmpty() ? new int[]{-1, -1} : new int[]{Collections.min(indexes), Collections.max(indexes)};
	}
}