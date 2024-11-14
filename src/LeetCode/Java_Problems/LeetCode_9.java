package LeetCode.Java_Problems;

//LINK: https://leetcode.com/problems/palindrome-number/description/

public class LeetCode_9 {
	public boolean isPalindrome(int x) {
		StringBuilder sb = new StringBuilder(String.valueOf(x));
		return sb.reverse().toString().equals(String.valueOf(x));
	}
}