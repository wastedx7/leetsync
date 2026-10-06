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
    public ListNode rotateRight(ListNode head, int k) {
        // Handle empty list, single node, or no rotations
        if (head == null || head.next == null || k == 0) {
            return head;
        }
        
        // 1. Find the length (n) and the old tail
        ListNode oldTail = head;
        int n = 1;
        while (oldTail.next != null) {
            oldTail = oldTail.next;
            n++;
        }
        
        // 2. Connect the old tail to the head to form a circle
        oldTail.next = head;
        
        // 3. Find the new tail
        // The new tail is exactly n - (k % n) nodes from the start.
        // We take one less step because our pointer starts on the 1st node (head).
        int stepsToNewTail = n - (k % n);
        ListNode newTail = head;
        for (int i = 0; i < stepsToNewTail - 1; i++) {
            newTail = newTail.next;
        }
        
        // 4. Break the circle and assign the new head
        ListNode newHead = newTail.next;
        newTail.next = null;
        
        return newHead;
    }
}