package LeetCode.Java_Problems;

public class LeetCode_5 {
	public static String longestPalindrome(String s) {
		if (s.length() < 2) {
			return s;
		}
		String result = "";
		for (int i = 1; i < s.length(); i++) {
			String oddLenPalindrome = checkForPalindrome(s, i, i);
			String evenLenPalindrome = checkForPalindrome(s, i - 1, i);
			String current = oddLenPalindrome.length() > evenLenPalindrome.length() ?
					oddLenPalindrome : evenLenPalindrome;
			if (current.length() > result.length()) {
				result = current;
			}
		}
		return result;
	}
	private static String checkForPalindrome(String s, int leftPointer, int rightPointer){
		while (s.charAt(leftPointer) == s.charAt(rightPointer)) {
			leftPointer--;
			rightPointer++;
			if (leftPointer == -1 || rightPointer == s.length()) {
				break;
			}
		}
		return s.substring(leftPointer + 1, rightPointer);
	}
}