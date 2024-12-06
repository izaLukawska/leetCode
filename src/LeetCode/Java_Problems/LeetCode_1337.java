package LeetCode.Java_Problems;

//LINK: https://leetcode.com/problems/the-k-weakest-rows-in-a-matrix/description/?envType=problem-list-v2&envId=matrix&difficulty=EASY

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LeetCode_1337 {
	public int[] kWeakestRows(int[][] mat, int k) {
		Map<Integer, Integer> soldierCount = new HashMap<>();
		for(int i = 0; i < mat.length; i++){
			soldierCount.put(i, (int) Arrays.stream(mat[i]).boxed()
					.filter(value -> value == 1).count());
		}
		return soldierCount.entrySet().stream()
				.sorted(Map.Entry.comparingByValue()).limit(k).mapToInt(Map.Entry::getKey).toArray();
	}
}