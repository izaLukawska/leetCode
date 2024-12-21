package LeetCode.Java_Problems;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//LINK: https://leetcode.com/problems/determine-if-two-strings-are-close/description/?envType=study-plan-v2&envId=leetcode-75

public class LeetCode_1657 {
	public boolean closeStrings(String word1, String word2) {
		if(word1.length() != word2.length()){
			return false;
		}
		Map<String, Long> word1Letters = lettersCount(word1);
		Map<String, Long> word2Letters = lettersCount(word2);

		return word1Letters.keySet().equals(word2Letters.keySet()) && getValues(word1Letters).equals(getValues(word2Letters));
	}

	private static Map<String,Long> lettersCount(String word){
		return Arrays.stream(word.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
	}

	private static List<Long> getValues(Map<String, Long> map){
		return map.values().stream().sorted().toList();
	}
}