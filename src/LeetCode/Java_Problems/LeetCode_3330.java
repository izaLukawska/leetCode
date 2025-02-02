package LeetCode.Java_Problems;

//LINK: https://leetcode.com/problems/find-the-original-typed-string-i/description/

public class LeetCode_3330 {
	public int possibleStringCount(String word) {
		int count = 1;

		for (int i = 0; i < word.length() - 1; i++) {
			if (word.charAt(i) == word.charAt(i + 1)) {
				count++;
			}
		}

		return count;
	}
}
