package LeetCode.Java_Problems;

//LINK: https://leetcode.com/problems/divide-two-integers/

public class LeetCode_29 {
	public int divide(int dividend, int divisor) {
		return dividend == Integer.MIN_VALUE && divisor == -1 ? Integer.MAX_VALUE : dividend / divisor;
	}
}