package LeetCode.Java_Problems;

//LINK: https://leetcode.com/problems/swap-nodes-in-pairs/description/

public class LeetCode_24 {
	public ListNode swapPairs(ListNode head) {
		ListNode result = new ListNode(0);
		result.next = head;
		ListNode point = result;

		while(point.next != null && point.next.next != null){
			ListNode swap1 = point.next;
			ListNode swap2 = point.next.next;

			swap1.next = swap2.next;
			swap2.next = swap1;

			point.next = swap2;
			point = swap1;
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