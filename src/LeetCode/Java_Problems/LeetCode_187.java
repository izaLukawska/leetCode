package LeetCode.Java_Problems;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

//LINK: https://leetcode.com/problems/repeated-dna-sequences/

public class LeetCode_187 {
	public List<String> findRepeatedDnaSequences(String s) {
		Set<String> seen = new HashSet<>();
		Set<String> result = new HashSet<>();

		for (int i = 0; i < s.length() - 9; i++) {
			String curr = s.substring(i, i + 10);
			if (seen.contains(curr)) {
				result.add(curr);
			} else {
				seen.add(curr);
			}
		}

		return result.stream().toList();
	}
}
