package LeetCode.Java_Problems;

//LINK: https://leetcode.com/problems/plus-one/submissions/1464232307/

public class LeetCode_66 {
	public static int[] plusOne(int[] digits) {
		for (int i = digits.length - 1; i >= 0; i--) {
			if (digits[i] < 9) {
				digits[i]++;
				return digits;
			}
			digits[i] = 0;
		}
		int[] answer = new int[digits.length + 1];
		answer[0] = 1;

		return answer;
	}
}