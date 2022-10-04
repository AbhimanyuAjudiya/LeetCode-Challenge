class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode current2 = new ListNode(10000);
        ListNode current = current2;
        ListNode next1 = list1, next2 = list2;
        
        while( next1 != null && next2 != null && current != null){
            if(next1.val <= next2.val){
                current.next = next1;
                current = current.next;
                next1 = next1.next;
            }else{
                current.next = next2;
                current = current.next;
                next2 = next2.next;
            }
        }
        
        while(next1 != null){
            current.next = next1;
            current = current.next;
            next1 = next1.next;
        }
        
        while(next2 != null){
            current.next = next2;
            current = current.next;
            next2 = next2.next;
 
        }
        
        current2 = current2.next;

        return current2;
        
    }
}
