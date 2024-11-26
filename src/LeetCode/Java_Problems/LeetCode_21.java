package LeetCode.Java_Problems;

//LINK: https://leetcode.com/problems/merge-two-sorted-lists/submissions/1453691994/

public class LeetCode_21 {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode result = new ListNode(0);
		ListNode l3 = result;
		while (l1 != null && l2 != null) {
			if (l1.val < l2.val) {
				l3.next = l1;
				l1 = l1.next;
			} else {
				l3.next = l2;
				l2 = l2.next;
			}
			l3 = l3.next;
		}

		if (l1 != null) {
			l3.next = l1;
		}
		if (l2 != null) {
			l3.next = l2;
		}

		return result.next;
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