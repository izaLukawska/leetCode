package LeetCode.Java_Problems;

//LINK: https://leetcode.com/problems/remove-linked-list-elements/description/

public class LeetCode_203 {
	public ListNode removeElements(ListNode head, int val) {
		ListNode newHead = new ListNode(0);
		newHead.next = head;
		ListNode result = newHead;

		while (result.next != null) {
			if (result.next.val == val) {
				result.next = result.next.next;
			} else {
				result = result.next;
			}
		}

		return val == 0 ? head : newHead.next;
	}

	private class ListNode {

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