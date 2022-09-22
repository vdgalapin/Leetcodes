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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        ListNode prev, result = new ListNode(0);
        prev = result;
        
        if((list1 == null) && (list2 == null)) {return null;}
        if(list1 == null) {return list2;}
        if(list2 == null) {return list1;}
        
        while(list1 != null && list2 != null) {
            
            
            // Goes through each of the list
            if(list1.val >= list2.val) {
                
                prev.next = list2;
                
                // next in the list 2
                list2 = list2.next;
            
            } else {
                
                prev.next = list1;
                
                // next in the list 1
                list1 = list1.next;
            }
            
            prev = prev.next;
        }
        
        if (list1 != null) {
            prev.next = list1;
        }
        
        if (list2 != null) {
            prev.next = list2;
        }
        
        
        return result.next;
        
    }
}