package LeetCode.Java_Problems;

//LINK: https://leetcode.com/problems/jump-game/

public class LeetCode_55 {
	public boolean canJump(int[] nums) {
		int maxReachable = 0;

		for (int i = 0; i < nums.length; ++i) {
			if (maxReachable < i) {
				return false;
			}
			maxReachable = Math.max(maxReachable, i + nums[i]);
		}

		return true;
	}
}