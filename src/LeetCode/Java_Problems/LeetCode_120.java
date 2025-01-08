package LeetCode.Java_Problems;

//LINK: https://leetcode.com/problems/triangle/description/

import java.util.List;

public class LeetCode_120 {
	public int minimumTotal(List<List<Integer>> triangle) {
		for (int row = triangle.size() - 2; row >= 0; row--) {
			for (int col = 0; col < triangle.get(row).size(); col++) {
				int currVal = triangle.get(row).get(col);
				int prevLeft = triangle.get(row + 1).get(col);
				int prevRight = triangle.get(row + 1).get(col + 1);
				int minPrev = Math.min(prevRight, prevLeft);
				triangle.get(row).set(col, currVal + minPrev);
			}
		}
		return triangle.getFirst().getFirst();
	}
}