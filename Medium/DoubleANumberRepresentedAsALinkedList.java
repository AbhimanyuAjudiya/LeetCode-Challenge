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
    ListNode root=null;
    public int solve(ListNode head){
        if(head==null) return 0;
        int temp=head.val*2+solve(head.next);
        ListNode nn=new ListNode(temp%10);
        nn.next=root;
        root=nn;
        //carry is returned to its parent
        return temp/10;
    }
    public ListNode doubleIt(ListNode head) {
        int temp=solve(head);
        //handling the extra carry
        if(temp!=0){
            ListNode nn=new ListNode(temp%10);
            nn.next=root;
            root=nn;
        }
        return root;
    }
}
