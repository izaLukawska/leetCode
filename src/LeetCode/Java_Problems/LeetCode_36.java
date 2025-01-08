package LeetCode.Java_Problems;

//LINK: https://leetcode.com/problems/valid-sudoku/

import java.util.HashSet;
import java.util.Set;

public class LeetCode_36 {
	public boolean isValidSudoku(char[][] board) {
		int len = board.length;
		Set<Character>[] rows = generateArrays(len);
		Set<Character>[] columns = generateArrays(len);
		Set<Character>[] subBoxes = generateArrays(len);

		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len; j++) {
				char curr = board[i][j];
				int subBox = i / 3 * 3 + j / 3;
				if (curr == '.') {
					continue;
				}
				if (checkCurrentChar(rows[i], columns[j], subBoxes[subBox], curr)) {
					return false;
				}

				rows[i].add(curr);
				columns[j].add(curr);
				subBoxes[subBox].add(curr);
			}
		}

		return true;
	}


	private boolean checkCurrentChar(Set<Character> row, Set<Character> column, Set<Character> subBox, char c) {
		return row.contains(c) || column.contains(c) || subBox.contains(c);
	}

	private Set<Character>[] generateArrays(int len) {
		Set<Character>[] result = new Set[len];
		for (int i = 0; i < result.length; i++) {
			result[i] = new HashSet<>();
		}
		return result;
	}
}