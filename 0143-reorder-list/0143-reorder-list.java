class Solution {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return;

        ListNode s = head;
        ListNode f = head;
        while(f.next != null && f.next.next != null){
            s = s.next;
            f = f.next.next;
        }
        
        // 1. Cut the list into two halves
        ListNode secondHalf = s.next;
        s.next = null; // <--- THIS IS THE MISSING LINE
        
        // 2. Reverse the second half
        ListNode mid = reverseList(secondHalf);
        
        // 3. Merge the two halves
        s = head;
        f = mid;

        while (f != null) {
            ListNode temp1 = s.next;
            ListNode temp2 = f.next;
            s.next = f;
            f.next = temp1;
            s = temp1;
            f = temp2;
        }
    }
    
    public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode pre = null;
        while(curr != null){
            ListNode newNode = curr.next;
            curr.next = pre;
            pre = curr;
            curr = newNode;
        }
        return pre;
    }
}