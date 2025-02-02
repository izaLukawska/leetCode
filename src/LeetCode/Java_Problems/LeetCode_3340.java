package LeetCode.Java_Problems;

//LINK: https://leetcode.com/problems/check-balanced-string/description/

public class LeetCode_3340 {
	public boolean isBalanced(String num) {
		String[] digits = num.split("");
		int evenSum = 0;
		int oddSum = 0;

		for (int i = 0; i < digits.length; i++) {
			if (i % 2 == 0) {
				evenSum += Integer.parseInt(digits[i]);
			} else {
				oddSum += Integer.parseInt(digits[i]);
			}
		}

		return evenSum == oddSum;
	}
}
