package LeetCode.Java_Problems;

//LINK: https://leetcode.com/problems/add-two-numbers/description/

public class LeetCode_2 {
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode result = new ListNode(0);
		ListNode l3 = result;
		int carry = 0;
		while (l1 != null || l2 != null) {
			int digit1 = (l1 != null) ? l1.val : 0;
			int digit2 = (l2 != null) ? l2.val : 0;
			int sum = digit1 + digit2 + carry;
			carry = sum / 10;

			l3.next = new ListNode(sum % 10);
			l3 = l3.next;

			if (l1 != null) {
				l1 = l1.next;
			}
			if (l2 != null) {
				l2 = l2.next;
			}
		}
		if (carry > 0) {
			l3.next = new ListNode(carry);
		}
		return result.next;
	}

	public static class ListNode {
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
