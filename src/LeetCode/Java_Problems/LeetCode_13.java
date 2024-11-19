package LeetCode.Java_Problems;

import java.util.HashMap;
import java.util.Map;

//LINK: https://leetcode.com/problems/roman-to-integer/submissions/1452715880/

public class LeetCode_13 {

	public static int romanToInt(String s) {
		int[] romanAsNumbers = convertToNumbers(s.toCharArray());

		int result = romanAsNumbers[s.length() - 1];
		for (int i = s.length() - 2; i >= 0; i--) {
			if (romanAsNumbers[i] < romanAsNumbers[i + 1]) {
				result -= romanAsNumbers[i];
			}
			else {
				result += romanAsNumbers[i];
			}
		}
		return result;
	}

	private static int[] convertToNumbers(char[] characters) {
		int[] result = new int[characters.length];
		for (int i = 0; i < characters.length; i++) {
			result[i] = romanIntValues().get(characters[i]);
		}
		return result;
	}

	private static Map<Character, Integer> romanIntValues() {
		Map<Character, Integer> result = new HashMap<>();
		result.put('I', 1);
		result.put('V', 5);
		result.put('X', 10);
		result.put('L', 50);
		result.put('C', 100);
		result.put('D', 500);
		result.put('M', 1000);
		return result;
	}
}