package LeetCode.Java_Problems;

import java.util.Arrays;

//LINK: https://leetcode.com/problems/3sum-closest/submissions/1453668768/

public class LeetCode_16 {
	public int threeSumClosest(int[] nums, int target) {
		Arrays.sort(nums);
		int sum = 0;
		int difference = Integer.MAX_VALUE;
		for(int i = 0; i < nums.length - 2; i++){
			int leftPointer = i + 1;
			int rightPointer = nums.length - 1;
			while(leftPointer < rightPointer){
				int currSum = nums[i] + nums[leftPointer] + nums[rightPointer];
				if(currSum == target){
					return target;
				}
				else if (currSum < target) {
					leftPointer++;
				}
				else{
					rightPointer--;
				}
				int currDiff = Math.abs(currSum - target);
				if(currDiff < difference){
					difference = currDiff;
					sum = currSum;
				}
			}
		}
		return sum;
	}
}