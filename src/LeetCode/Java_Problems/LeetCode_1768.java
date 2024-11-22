package LeetCode.Java_Problems;

//LINK: https://leetcode.com/problems/merge-strings-alternately/description/?envType=study-plan-v2&envId=leetcode-75

public class LeetCode_1768 {
	public static String mergeAlternately(String word1, String word2) {
		StringBuilder result = new StringBuilder();
		int len = Math.min(word1.length(), word2.length());
		for (int i = 0; i < len; i++) {
			result.append(word1.charAt(i));
			result.append(word2.charAt(i));
		}
		if (word1.length() <= word2.length()) {
			result.append(word2.substring(len));
		}
		else {
			result.append(word1.substring(len));
		}
		return result.toString();
	}
}