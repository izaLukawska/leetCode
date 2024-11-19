package LeetCode.Java_Problems;

//LINK: https://leetcode.com/problems/merge-k-sorted-lists/description/

public class LeetCode_23 {
	public ListNode mergeKLists(ListNode[] lists) {
		if(lists.length == 0){
			return new ListNode().next;
		}
		if(lists.length == 1){
			return lists[0];
		}
		ListNode mergedArrays = mergeTwoLists(lists[0], lists[1]);
		for(int i = 2; i < lists.length; i++){
			mergedArrays = mergeTwoLists(mergedArrays, lists[i]);
		}
		return mergedArrays;
	}

	private static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode result = new ListNode(0);
		ListNode tempNode = result;
		while(l1 != null && l2 != null){
			if(l1.val < l2.val){
				tempNode.next = l1;
				l1 = l1.next;
			}
			else{
				tempNode.next = l2;
				l2 = l2.next;
			}
			tempNode = tempNode.next;
		}
		if(l1 != null){
			tempNode.next = l1;
		}
		if(l2 != null){
			tempNode.next = l2;
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