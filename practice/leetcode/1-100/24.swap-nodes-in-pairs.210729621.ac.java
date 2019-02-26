/*
 * @lc app=leetcode id=24 lang=java
 *
 * [24] Swap Nodes in Pairs
 *
 * https://leetcode.com/problems/swap-nodes-in-pairs/description/
 *
 * algorithms
 * Medium (43.06%)
 * Total Accepted:    279.9K
 * Total Submissions: 649.9K
 * Testcase Example:  '[1,2,3,4]'
 *
 * Given a linked list, swap every two adjacent nodes and return its head.
 *
 * You may not modify the values in the list's nodes, only nodes itself may be
 * changed.
 *
 *
 *
 * Example:
 *
 *
 * Given 1->2->3->4, you should return the list as 2->1->4->3.
 *
 *
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
	if (head == null || head.next == null) {
	    return head;
	}
        ListNode dummy = new ListNode(-1);
	ListNode pre = new ListNode(0);
        ListNode newHead = null;
	while (head != null && head.next != null) {
	    newHead = head.next;
	    pre.next = newHead;
	    head.next = newHead.next;
	    newHead.next = head;
	    pre = head;

	    if (dummy.next == null) {
	        dummy.next = newHead;
	    }
	    if (head.next != null) {
	        head = head.next;
	    }
	}
	return dummy.next;
    }
}

