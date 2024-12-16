package LeetCode.Java_Problems;

import java.util.*;

public class LeetCode_49 {
	public List<List<String>> groupAnagrams(String[] strs) {
		Map<String, List<String>> anagrams = new HashMap<>();
		for (int i = 0; i < strs.length; i++) {
			char[] letters = strs[i].toCharArray();
			Arrays.sort(letters);
			String sortedStr = String.valueOf(letters);
			anagrams.computeIfAbsent(sortedStr, key -> new ArrayList<>()).add(strs[i]);
		}
		return anagrams.values().stream().toList();
	}
}