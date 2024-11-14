package LeetCode.Java_Problems;

//LINK: https://leetcode.com/problems/zigzag-conversion/description/

public class LeetCode_6 {

	public static String convert(String s, int numRows) {
		if(numRows == 1){
			return s;
		}
		StringBuilder[] rows = new StringBuilder[numRows];
		for(int i = 0; i < rows.length; i++){
			rows[i] = new StringBuilder();
		}

		int currRow = 0;
		boolean travelDown = false;
		for(int i = 0; i < s.length(); i++){
			if(currRow == 0 || currRow == numRows - 1){
				travelDown = !travelDown;
			}
			rows[currRow].append(s.charAt(i));
			currRow = travelDown ? currRow + 1 : currRow - 1;
		}

		StringBuilder result = new StringBuilder();
		for(int i = 0; i < numRows; i++){
			result.append(rows[i].toString());
		}
		return result.toString();
	}
}