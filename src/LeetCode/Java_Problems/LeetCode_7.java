package LeetCode.Java_Problems;

//LINK: https://leetcode.com/problems/reverse-integer/description/

public class LeetCode_7 {
	public int reverse(int x) {
		StringBuilder sb = new StringBuilder(String.valueOf(Math.abs(x)));
		int result;
		try {
			result = Integer.parseInt(sb.reverse().toString());
		}
		catch (NumberFormatException e) {
			return 0;
		}
		return x >= 0 ? result : -1 * result;
	}
}