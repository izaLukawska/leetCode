package LeetCode.Java_Problems;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//LINK: https://leetcode.com/problems/majority-element-ii/description/

public class LeetCode_229 {
	public List<Integer> majorityElement(int[] nums) {
		return Arrays.stream(nums).boxed()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.entrySet().stream()
				.filter(num ->num.getValue() > nums.length / 3 ).mapToInt(Map.Entry::getKey).boxed().toList();
	}
}