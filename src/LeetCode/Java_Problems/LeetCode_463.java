package LeetCode.Java_Problems;

//LINK: https://leetcode.com/problems/island-perimeter/description/

public class LeetCode_463 {
	public int islandPerimeter(int[][] grid) {
		int islandCount = 0;
		int neighbourCount = 0;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				if (grid[i][j] == 1) {
					islandCount++;
					if (checkPrevRow(grid, i, j)) {
						neighbourCount++;
					}
					if (checkPrevColumn(grid, i, j)) {
						neighbourCount++;
					}
				}
			}
		}

		return islandCount * 4 - neighbourCount * 2;
	}

	private boolean checkPrevRow(int[][] grid, int row, int column) {
		return row - 1 >= 0 && grid[row - 1][column] == 1;
	}

	private boolean checkPrevColumn(int[][] grid, int row, int column) {
		return column - 1 >= 0 && grid[row][column - 1] == 1;
	}
}