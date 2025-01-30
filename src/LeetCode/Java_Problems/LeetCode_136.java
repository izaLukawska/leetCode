package LeetCode.Java_Problems;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//LINK: https://leetcode.com/problems/single-number/description/

public class LeetCode_136 {
	public int singleNumber(int[] nums) {
		return Arrays.stream(nums).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.entrySet().stream().min(Map.Entry.comparingByValue()).get().getKey();
	}
}
