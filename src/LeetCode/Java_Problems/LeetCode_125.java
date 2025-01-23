package LeetCode.Java_Problems;

//LINK: https://leetcode.com/problems/valid-palindrome/submissions/1518004105/
public class LeetCode_125 {
	public boolean isPalindrome(String s) {
		StringBuilder result = new StringBuilder();

		for(int i = 0; i < s.length(); i++){
			if(Character.isLetterOrDigit(s.charAt(i))){
				result.append(s.charAt(i));
			}
		}

		return result.toString().equalsIgnoreCase(result.reverse().toString());
	}
}