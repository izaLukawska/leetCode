package LeetCode.Java_Problems;

//LINK: https://leetcode.com/problems/length-of-last-word/description/

public class LeetCode_58 {
	public int lengthOfLastWord(String s) {
		String[] words = s.trim().split(" ");
		return words[words.length - 1].length();
	}
}