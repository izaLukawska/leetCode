package LeetCode.Java_Problems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//LINK: https://leetcode.com/problems/top-k-frequent-elements/description/

public class LeetCode_347 {
	public int[] topKFrequent(int[] nums, int k) {
		return Arrays.stream(nums).boxed()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.entrySet().stream()
				.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
				.limit(k)
				.mapToInt(Map.Entry::getKey)
				.toArray();
	}
}
