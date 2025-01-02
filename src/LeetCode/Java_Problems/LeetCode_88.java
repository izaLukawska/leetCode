package LeetCode.Java_Problems;

//LINK: https://leetcode.com/problems/merge-sorted-array/

import java.util.Arrays;

public class LeetCode_88 {
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		int start = 0;
		for(int i = m; i < nums1.length; i++){
			nums1[i] = nums2[start];
			start++;
		}

		Arrays.sort(nums1);
	}
}