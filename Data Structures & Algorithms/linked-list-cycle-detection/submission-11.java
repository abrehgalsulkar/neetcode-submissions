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
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) return false;
        ListNode slow = head;
        ListNode fast = slow.next;
        fast = fast.next;

        while (fast != null && fast.next != null) {
            if(fast == slow) {
                return true;
            } else {
                slow = slow.next;
                fast = fast.next;
                fast = fast.next;
            }
        }

        return false;

    }
}
