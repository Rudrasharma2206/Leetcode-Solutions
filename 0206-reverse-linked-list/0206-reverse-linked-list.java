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
    public ListNode reverseList(ListNode head) {
        ListNode Rev=new ListNode();
        Stack<Integer> s=new Stack<>();
        while(head!=null){
            s.push(head.val);
            head=head.next;
        }
        ListNode curr=Rev;
        while(!s.isEmpty()){
            curr.next=new ListNode(s.pop());
            curr=curr.next;
        }
        return Rev.next;

    }
}