package LeetCode.Java_Problems;

//LINK: https://leetcode.com/problems/add-two-numbers/description/

import java.util.List;

public class LeetCode_2 {
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode result = new ListNode(0);
		ListNode l3 = result;
		int carry = 0;
		while (l1 != null || l2 != null) {
			int digit1 = getNodeValue(l1);
			int digit2 = getNodeValue(l2);
			int sum = calculateSum(digit1, digit2, carry);
			carry = sum / 10;

			l3.next = new ListNode(sum % 10);
			l3 = l3.next;

			l1 = moveToNextNode(l1);
			l2 = moveToNextNode(l2);
		}

		if (carry > 0) {
			l3.next = new ListNode(carry);
		}

		return result.next;
	}

	private static int getNodeValue(ListNode node){
		return node != null ? node.val : 0;
	}

	private static ListNode moveToNextNode(ListNode node){
		return node != null ? node.next : null;
	}

	private static int calculateSum(int val1, int val2, int carry){
		return val1 + val2 + carry;
	}

	private static class ListNode {
		int val;
		ListNode next;

		ListNode() {}

		ListNode(int val) {this.val = val;}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}
}