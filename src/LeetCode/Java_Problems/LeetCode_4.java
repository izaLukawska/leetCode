package LeetCode.Java_Problems;

import java.util.Arrays;

//LINK: https://leetcode.com/problems/median-of-two-sorted-arrays/description/

public class LeetCode_4 {
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int[] sum = new int[nums1.length + nums2.length];
		int index = 0;
		for(int i = 0 ; i < sum.length; i++){
			if(i < nums1.length){
				sum[i] = nums1[i];
			}
			else{
				sum[i] = nums2[index];
				index++;
			}
		}
		Arrays.sort(sum);
		if(sum.length == 1){
			return sum[0];
		}
		int firstNumber = sum[sum.length / 2 - 1];
		int secondNumber = sum[sum.length / 2];
		return sum.length % 2 != 0 ? secondNumber : (double) (firstNumber + secondNumber) / 2;
	}
}