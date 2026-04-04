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
        if(l1 == null && l2 != null || l1 == null && l2 == null){
            return l2;
        }
        
        if(l1 != null && l2 == null){
            return l1;
        }
        
        ListNode result = new ListNode(0);
        ListNode current = result;
        boolean v = false;

        while(l1 != null && l2 != null){
            if(v){
                if(l1.val + l2.val > 9){
                    current.next = new ListNode((l1.val + l2.val + 1) % 10);
                }
                else{
                    current.next = new ListNode(l1.val + l2.val + 1);
                    v = false;
                }
            }
            else{
                if(l1.val + l2.val > 9){
                    current.next = new ListNode((l1.val + l2.val) % 10);
                    v = true;
                }
                else{
                    current.next = new ListNode(l1.val + l2.val);
                }
                
            }
            l1 = l1.next;
            l2 = l2.next;
            current = current.next;
        }

        while(l2 != null){
            if(v){
                if(l2.val + 1 > 9){
                    current.next = new ListNode((1 + l2.val) % 10);
                }
                else{
                    current.next = new ListNode(l2.val + 1);
                    v = false;
                }
            }
            else{
                current.next = new ListNode(l2.val);
            }
            l2 = l2.next;
            current = current.next;
        }

        while(l1 != null){
            if(v){
                if(l1.val + 1 > 9){
                    current.next = new ListNode((1 + l1.val) % 10);
                }
                else{
                    current.next = new ListNode(l1.val + 1);
                    v = false;
                }
            }
            else{
                current.next = new ListNode(l1.val);
            }
            l1 = l1.next;
            current = current.next;
        }

        if(v){
            current.next = new ListNode(1);
        }

        return result.next;
    }
}
