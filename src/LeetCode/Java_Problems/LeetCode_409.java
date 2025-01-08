package LeetCode.Java_Problems;

//LINK: https://leetcode.com/problems/longest-palindrome/description/

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LeetCode_409 {
	public int getLongestPalindromeLength(String s) {
		int len = 0;
		boolean isOdd = false;
		for (int count : charCount(s)) {
			if (count % 2 == 0) {
				len += count;
			} else {
				len += count - 1;
				isOdd = true;
			}
		}
		return isOdd ? len + 1 : len;
	}

	private List<Integer> charCount(String s){
		return Arrays.stream(s.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.values().stream().mapToInt(Long::intValue).boxed().toList();
	}
}