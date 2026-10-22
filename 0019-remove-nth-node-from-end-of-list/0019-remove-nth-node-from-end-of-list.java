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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size=size(head);
        int index=size-n;
        ListNode curr=head;
        int currIndex=0;
        if(index==0){
            return head.next;
        }
        while(curr!=null && currIndex<index-1){
            curr=curr.next;
            currIndex++;
        }
        if (curr == null || curr.next == null) {
        return head;
        }      
        curr.next=curr.next.next;
        return head;  
        

    }
    

    public int size(ListNode head){
        int size=0;
        while(head!=null){
            size++;
            head=head.next;
        }
        return size;
    }
}