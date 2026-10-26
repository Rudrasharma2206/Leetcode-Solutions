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
    public ListNode reverseKGroup(ListNode head, int k) {
        if (k <= 1 || head == null) return head;
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode temp = dummy;
        ListNode curr = head;
        
        while (curr != null) {  
            ListNode currHead = curr;
            int count = 1;
            
            while (count != k && currHead != null) {
                currHead = currHead.next;
                count++;
            }
            
            
            if (currHead == null) {
                temp.next = curr;
                break;
            }
            
            
            ListNode nextGroup = currHead.next;
            currHead.next = null; 
            ListNode tail = curr; 
            
            
            ListNode reversedHead = reverse(curr);
            
            
            temp.next = reversedHead; 
            temp = tail;              
            curr = nextGroup;         
        }
        
        return dummy.next;
    }
    
    public ListNode reverse(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        while (curr != null) {
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;
    }
}