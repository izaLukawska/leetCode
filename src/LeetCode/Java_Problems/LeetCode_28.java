package LeetCode.Java_Problems;

//https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/

public class LeetCode_28 {
	public int strStr(String haystack, String needle) {
		int result = -1;
		for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
			if ((haystack.startsWith(needle, i))) {
				result = i;
				break;
			}
		}
		return result;
	}
}