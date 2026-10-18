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
    public ListNode middleNode(ListNode head) {
        ListNode curr=head;
        int n=size(head);
        if(n==1) return head;
        int i=0;
        while(i<n/2-1){
            curr=curr.next;
            i++;
        }
        return curr.next;
    }
    public int size(ListNode head) {
        ListNode curr = head;
        int size = 0;

        while (curr != null) {
            curr = curr.next;
            size++;
            
        }
        return size;
    }
}