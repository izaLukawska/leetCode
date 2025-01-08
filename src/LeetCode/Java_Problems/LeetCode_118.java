package LeetCode.Java_Problems;

//LINK: https://leetcode.com/problems/pascals-triangle/description/

import java.util.ArrayList;
import java.util.List;

public class LeetCode_118 {
	public List<List<Integer>> generatePascalsTriangle(int numRows) {
		if (numRows == 0) {
			return new ArrayList<>();
		}

		List<List<Integer>> result = new ArrayList<>();
		List<Integer> firstRow = List.of(1);
		result.add(firstRow);

		if (numRows == 1) {
			return result;
		}

		for (int i = 1; i < numRows; i++) {
			List<Integer> prevRow = result.get(i - 1);
			List<Integer> currRow = new ArrayList<>();
			currRow.add(1);
			for (int j = 0; j < i - 1; j++) {
				currRow.add(prevRow.get(j) + prevRow.get(j + 1));
			}
			currRow.add(1);
			result.add(currRow);
		}

		return result;
	}
}