package LeetCode.Java_Problems;

//LINK: https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/?envType=problem-list-v2&envId=matrix&difficulty=EASY

public class LeetCode_1351 {
	public int countNegatives(int[][] grid) {
		int count = 0;
		for (int[] row : grid) {
			for (int i : row) {
				if (i < 0) {
					count++;
				}
			}
		}
		return count;
	}
}