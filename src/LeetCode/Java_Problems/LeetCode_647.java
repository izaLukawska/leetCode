package LeetCode.Java_Problems;

public class LeetCode_647 {
	public int countSubstrings(String s) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			count += palindromeCount(s, i, i);
			count += palindromeCount(s, i, i + 1);
		}
		return count;
	}

	private int palindromeCount(String s, int left, int right) {
		int count = 0;
		while (left >= 0 && right < s.length()) {
			if (s.charAt(left) == s.charAt(right)) {
				count++;
				left--;
				right++;
			} else {
				break;
			}
		}

		return count;
	}
}