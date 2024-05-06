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
    public ListNode removeNodes(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode prev = null, temp = head;
        while(temp!= null){
            ListNode next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }
        temp = prev.next;
        prev.next = null;
        while(temp != null) {
            ListNode t = temp.next;
            if(temp.val >= prev.val) {
                temp.next = prev;
                prev = temp;
            }
            temp = t;
        }
        return prev;
    }
}
