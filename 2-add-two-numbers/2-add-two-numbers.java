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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        
        ListNode prev, result = new ListNode();
        prev = result;
        
    
        
        int add = 0;
        ListNode single = new ListNode(0);
        
        int carry = 0;
        
        
        while(l1 != null && l2 != null) {
            
            add = l1.val + l2.val + carry;
            
                      
            prev.next = new ListNode(add % 10);
           
            prev = prev.next;        
            l1 = l1.next;
            l2 = l2.next;
            
            if(add > 9) {
                carry = 1;
            } else {
                carry = 0;
            }    
            
        }
        
        
        while(l1 != null) {
            
            add = l1.val + carry;
                
            
            prev.next = new ListNode(add % 10);
            l1 = l1.next;
            prev = prev.next;       
            
            if(add > 9) {
                carry = 1;
            } else {
                carry = 0;
            }  
            
        }
        
        while(l2 != null) {
            
            add = l2.val + carry;
            
            prev.next = new ListNode(add % 10);
            
            prev = prev.next;       
            l2 = l2.next;
            
            if(add > 9) {
                carry = 1;
            } else {
                carry = 0;
            }  
            
        }
        
        if (carry == 1) {
            
            
            prev.next = new ListNode(1);
            System.out.println("single:" + carry);
        }
        
   
        return result.next;
        
    }
}