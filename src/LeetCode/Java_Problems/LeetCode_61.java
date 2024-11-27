package LeetCode.Java_Problems;

//LINK: https://leetcode.com/problems/rotate-list/submissions/1464192750/

public class LeetCode_61 {
	public ListNode rotateRight(ListNode head, int k) {
		if (head == null || k == 0) {
			return head;
		}

		ListNode current = head;
		int len = 1;
		while (current.next != null) {
			current = current.next;
			len++;
		}
		current.next = head;

		ListNode newTail = findNewTail(head, len, k);
		ListNode result = newTail.next;
		newTail.next = null;

		return result;
	}

	private static ListNode findNewTail(ListNode head, int len, int k) {
		ListNode newTail = head;
		for (int i = 1; i < len - k % len; i++) {
			newTail = newTail.next;
		}

		return newTail;
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