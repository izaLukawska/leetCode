package LeetCode.Java_Problems;

//LINK: https://leetcode.com/problems/string-to-integer-atoi/description/

public class LeetCode_8 {
	public static int myAtoi(String k) {
		if (k.isEmpty() || k.trim().isEmpty()) {
			return 0;
		}
		k = k.trim();
		int startIndex =  k.charAt(0) == '-' || k.charAt(0) == '+' ? 1 : 0;
		String answer = onlyDigitsSubstring(k, startIndex, startIndex);
		int result;
		try{
			result = answer.isEmpty() ? 0 : Integer.parseInt(answer);
		}
		catch (NumberFormatException e){
			result = k.charAt(0) == '-' ? Integer.MIN_VALUE : Integer.MAX_VALUE;
		}
		return k.charAt(0) == '-' ?  -1 * result : result;
	}

	private static String onlyDigitsSubstring(String s, int startIndex, int endIndex){
		while(endIndex < s.length() && Character.isDigit(s.charAt(endIndex))){
			endIndex++;
		}
		return s.substring(startIndex, endIndex);
	}
}