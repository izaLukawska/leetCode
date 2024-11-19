package LeetCode.Java_Problems;

//LINK: https://leetcode.com/problems/remove-nth-node-from-end-of-list/

public class LeetCode_19 {
	public static ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode result = new ListNode(0);
		result.next = head;
		ListNode slow = result;
		ListNode fast = result;
		for(int i = 0; i < n; i++){
			fast = fast.next;
		}
		while(fast.next != null){
			slow = slow.next;
			fast = fast.next;
		}
		slow.next = slow.next.next;
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
