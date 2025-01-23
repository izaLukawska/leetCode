package LeetCode.Java_Problems;

//LINK: https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/description/

public class LeetCode_122 {
	public int maxProfit(int[] prices) {
		int profit = 0;

		for(int i = 1; i < prices.length; i++){
			int dailyProfit = Math.max(0, prices[i] - prices[i-1]);
			profit += dailyProfit;
		}

		return profit;
	}
}
