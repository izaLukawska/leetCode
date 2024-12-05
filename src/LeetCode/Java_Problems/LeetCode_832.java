package LeetCode.Java_Problems;

//LINK: https://leetcode.com/problems/flipping-an-image/description/?envType=problem-list-v2&envId=matrix&difficulty=EASY

public class LeetCode_832 {
	public int[][] flipAndInvertImage(int[][] image) {
		int[][] result = new int[image.length][image[0].length];

		for (int i = 0; i < result.length; i++) {
			int currColumn = result[i].length - 1;
			for (int j = 0; j < result[i].length; j++) {
				if (image[i][currColumn] == 1) {
					result[i][j] = image[i][currColumn] - 1;
				} else {
					result[i][j] = image[i][currColumn] + 1;
				}
				currColumn--;
				if (currColumn < 0) {
					break;
				}
			}
		}

		return result;
	}
}