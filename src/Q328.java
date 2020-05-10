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
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        
        ListNode res = head;
        ListNode res2 = head.next;
        ListNode odd = head;
        ListNode even = head.next; 
        odd.next = null;
        
        while (even != null && even.next != null) {
            ListNode oddNext = even.next;
            ListNode evenNext = oddNext.next;
            
            odd.next = oddNext;
            even.next = evenNext;
            odd = oddNext;
            even = evenNext;
        }
        
        odd.next = res2;
        return res;
    }
}
