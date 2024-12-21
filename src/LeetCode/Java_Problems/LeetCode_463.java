package LeetCode.Java_Problems;

public class LeetCode_463 {
	public int islandPerimeter(int[][] grid) {
		int islandCount = 0;
		int neighbourCount = 0;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				if (grid[i][j] == 1) {
					islandCount++;
					if (i - 1 >= 0 && grid[i - 1][j] == 1) {
						neighbourCount++;
					}
					if (j - 1 >= 0 && grid[i][j - 1] == 1) {
						neighbourCount++;
					}
				}
			}
		}
		return islandCount * 4 - neighbourCount * 2;
	}
}
