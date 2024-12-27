package LeetCode.Java_Problems;

//LINK: https://leetcode.com/problems/palindrome-linked-list/

public class LeetCode_234 {
	public boolean isPalindrome(ListNode head) {
		if (head == null || head.next == null) {
			return true;
		}
		ListNode reversedList = reverseAndCopy(head);
		ListNode original = head;
		ListNode reversed = reversedList;
		while (original != null) {
			if (original.val != reversed.val) {
				return false;
			}
			original = original.next;
			reversed = reversed.next;

		}

		return true;
	}

	private ListNode reverseAndCopy(ListNode head) {
		ListNode newHead = null;
		while (head != null) {
			ListNode newNode = new ListNode(head.val); // Create a new node
			newNode.next = newHead;
			newHead = newNode;
			head = head.next;
		}

		return newHead;
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