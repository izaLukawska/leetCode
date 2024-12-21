package LeetCode.Java_Problems;

//LINK: https://leetcode.com/problems/equal-row-and-column-pairs/?envType=study-plan-v2&envId=leetcode-75

import java.util.Arrays;

public class LeetCode_2352 {
	public int equalPairs(int[][] grid) {
		int[][] switchedGrid = rotatedArray(grid);
		int count = 0;
		for (int[] gridValue : grid) {
			for (int[] switchedValue : switchedGrid) {
				if (Arrays.equals(gridValue, switchedValue)) {
					count++;
				}
			}
		}
		return count;
	}

	private static int[][] rotatedArray(int[][] grid) {
		int[][] result = new int[grid[0].length][grid.length];
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[0].length; j++) {
				result[i][j] = grid[j][i];
			}
		}
		return result;
	}
}