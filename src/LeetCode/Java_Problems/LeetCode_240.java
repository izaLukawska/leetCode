package LeetCode.Java_Problems;

//LINK: https://leetcode.com/problems/search-a-2d-matrix-ii/description/

public class LeetCode_240 {
	public boolean searchMatrix(int[][] matrix, int target) {
		int currRow = matrix.length - 1;
		int currCol = 0;
		while (currRow >= 0 && currCol < matrix[0].length) {
			int currNumber = matrix[currRow][currCol];
			if (currNumber == target) {
				return true;
			}

			if (currNumber < target) {
				currCol++;
			} else {
				currRow--;
			}
		}

		return false;
	}
}