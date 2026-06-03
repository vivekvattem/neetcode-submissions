/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode groupPrev = dummy;

        while (true) {
            ListNode fast = groupPrev;
            ListNode slow = groupPrev;

            for (int i = 0; i < k; i++) {
                fast = fast.next;

                if (fast == null) {
                    return dummy.next;
                }
            }

            ListNode groupNext = fast.next;

            ListNode prev = groupNext;
            ListNode curr = slow.next;

            while (curr != groupNext) {
                ListNode next = curr.next;

                curr.next = prev;
                prev = curr;
                curr = next;
            }

            ListNode temp = slow.next;

            slow.next = fast;
            groupPrev = temp;
        }
    }
}