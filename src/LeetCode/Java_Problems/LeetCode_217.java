package LeetCode.Java_Problems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

//LINK: https://leetcode.com/problems/contains-duplicate/

public class LeetCode_217 {
	public boolean containsDuplicate(int[] nums) {
		Set<Integer> numsSet = new HashSet<>();
		for (int num : nums) {
			if (numsSet.contains(num)) {
				return true;
			}
			numsSet.add(num);
		}

		return false;
	}

	public boolean containsDuplicate2(int[] nums) {
		return Arrays.stream(nums).boxed().collect(Collectors.toSet()).size() != nums.length;
	}
}