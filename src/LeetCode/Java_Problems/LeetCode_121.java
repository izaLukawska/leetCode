package LeetCode.Java_Problems;

//LINK: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

public class LeetCode_121 {
	public int maxProfit(int[] prices) {
		int maxProfit = 0;
		int currPrice = prices[0];
		for(int price : prices){
			currPrice = Math.min(price, currPrice);
			maxProfit = Math.max(maxProfit, price - currPrice);
		}
		return maxProfit;
	}
}