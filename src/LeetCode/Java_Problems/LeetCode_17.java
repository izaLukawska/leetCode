package LeetCode.Java_Problems;

//LINK: https://leetcode.com/problems/letter-combinations-of-a-phone-number/submissions/1453669555/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LeetCode_17 {
	public static List<String> letterCombinations(String digits) {
		String[] numbers = digits.split("");
		if (digits.isEmpty()) {
			return new ArrayList<>();
		}

		List<String> result = phoneKeyboard().get(numbers[0]);
		for(int i = 1; i < numbers.length; i++){
			result = twoNumbers(result, phoneKeyboard().get(numbers[i]));
		}

		return result;
	}
	private static List<String> twoNumbers(List<String> l1, List<String> l2){
		List<String> result = new ArrayList<>();
		for (String s1 : l1) {
			for (String s2 : l2) {
				result.add(s1 + s2);
			}
		}

		return result;
	}

	private static Map<String, List<String>> phoneKeyboard() {
		Map<String, List<String>> result = new HashMap<>();
		result.put("2", List.of("a", "b", "c"));
		result.put("3", List.of("d", "e", "f"));
		result.put("4", List.of("g", "h", "i"));
		result.put("5", List.of("j", "k", "l"));
		result.put("6", List.of("m", "n", "o"));
		result.put("7", List.of("p", "q", "r", "s"));
		result.put("8", List.of("t", "u", "v"));
		result.put("9", List.of("w", "x", "y", "z"));
		return result;
	}
}