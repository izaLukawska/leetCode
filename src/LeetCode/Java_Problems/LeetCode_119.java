package LeetCode.Java_Problems;

//LINK: https://leetcode.com/problems/pascals-triangle-ii/description/

import java.util.ArrayList;
import java.util.List;

public class LeetCode_119 {
	public List<Integer> getRow(int rowIndex) {
		return generateTriangle(rowIndex + 1).get(rowIndex);
	}

	private List<List<Integer>> generateTriangle(int rowIndex) {
		List<List<Integer>> result = new ArrayList<>();
		List<Integer> firstRow = List.of(1);
		result.add(firstRow);
		for (int i = 1; i < rowIndex; i++) {
			List<Integer> prev = result.get(i - 1);
			List<Integer> curr = new ArrayList<>();
			curr.add(1);
			for (int j = 0; j < i - 1; j++) {
				curr.add(prev.get(j) + prev.get(j + 1));
			}
			curr.add(1);
			result.add(curr);
		}
		return result;
	}
}