package LeetCode.Java_Problems;

//LINK: https://leetcode.com/problems/longest-substring-without-repeating-characters/description/

public class LeetCode_3 {
	public static int lengthOfLongestSubstring(String s) {
		char[] letters = s.toCharArray();
		int maxLength = 0;
		StringBuilder result = new StringBuilder();
		for (char letter : letters) {
			if (!result.toString().contains(String.valueOf(letter))) {
				result.append(letter);
			}
			else {
				result = new StringBuilder();
				maxLength = Math.max(maxLength, result.length());
			}
		}
		return maxLength;
	}
}
