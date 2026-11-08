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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int length = 0;
        while(temp != null){
            length++;
            temp = temp.next;
        }
        if(length == n) return head.next;
        int count = length - n - 1;
        temp = head;
        while(count != 0){
            temp = temp.next;
            count--;
        }
        temp.next = temp.next.next;
        return head;
    }
}