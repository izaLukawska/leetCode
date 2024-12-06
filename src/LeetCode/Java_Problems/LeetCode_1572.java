package LeetCode.Java_Problems;

//LINK: https://leetcode.com/problems/matrix-diagonal-sum/description/?envType=problem-list-v2&envId=matrix&difficulty=EASY

public class LeetCode_1572 {
	public int diagonalSum(int[][] mat) {
		int sum = 0;

		int row = 0;
		int leftIdx = 0;
		int rightIdx = mat[0].length - 1;

		while (row < mat.length && leftIdx < mat[0].length && rightIdx >= 0) {
			if (mat.length * mat[0].length % 2 != 0 && leftIdx == rightIdx) {
				sum += mat[row][leftIdx];
			} else {
				sum += mat[row][leftIdx] + mat[row][rightIdx];
			}
			row++;
			leftIdx++;
			rightIdx--;
		}

		return sum;
	}
}
