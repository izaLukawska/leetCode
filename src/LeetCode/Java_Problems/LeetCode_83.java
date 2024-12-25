package LeetCode.Java_Problems;

//LINK: https://leetcode.com/problems/remove-duplicates-from-sorted-list/description/

public class LeetCode_83 {
	public ListNode deleteDuplicates(ListNode head) {
		if (head == null) {
			return null;
		}

		ListNode prev = head;
		ListNode curr = prev.next;

		while (curr != null) {
			if(curr.val == prev.val){
				curr = curr.next;
				continue;
			}
			prev.next = curr;
			prev = curr;
			curr = curr.next;
		}

		prev.next = null;

		return head;
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