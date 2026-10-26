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
        if (head == null || head.next == null || k == 0) {
            return head;
        }
        
        // Find the length of the list to optimize k
        int length = 0;
        ListNode curr = head;
        while (curr != null) {
            curr = curr.next;
            length++;
        }
        
        // If k is a multiple of length, the list remains unchanged
        k = k % length;
        
        // Rotate the list k times using your rotate function
        while (k > 0) {
            head = rotate(head);
            k--;
        }
        
        return head;
    }
    
    public ListNode rotate(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        
        ListNode prev = null;
        ListNode curr = head;
        
        while (curr.next != null) {
            prev = curr;
            curr = curr.next;
        }
        prev.next = null;   
        curr.next = head;  
        
        return curr;        
    }
}