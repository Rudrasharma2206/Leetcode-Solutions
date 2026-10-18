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
        // Edge case: if the list is empty or has only one or two nodes, 
        // no re-ordering is needed.
        if (head == null || head.next == null) {
            return head;
        }
        
        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even; // Save the start of the even list to connect later
        
        // Traverse the list and rearrange pointers
        while (even != null && even.next != null) {
            odd.next = even.next; // Connect odd to the next odd node
            odd = odd.next;       // Advance the odd pointer
            
            even.next = odd.next; // Connect even to the next even node
            even = even.next;     // Advance the even pointer
        }
        
        // Attach the even list to the end of the odd list
        odd.next = evenHead;
        
        return head;
    }
}