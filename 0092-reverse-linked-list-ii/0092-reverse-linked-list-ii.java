import java.util.Stack;

class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right) {
            return head;
        }

        ListNode rev = new ListNode(0);
        ListNode cursor = rev;
        Stack<Integer> s = new Stack<>();
        
    
        ListNode curr = head;
        int k = 1;
        while (k < left) {
            curr = curr.next;
            k++;
        }
        
        ListNode temp = curr;
        while (k <= right) {
            s.push(temp.val);
            temp = temp.next;
            k++;
        }
        
    
        ListNode p = head;
        int x = 1;
        
     
        while (x < left) {
            cursor.next = new ListNode(p.val);
            cursor = cursor.next;
            p = p.next;
            x++;
        }
        

        while (!s.isEmpty()) {
            cursor.next = new ListNode(s.pop());
            cursor = cursor.next;
            p = p.next; // Skip over the original reversed nodes in p
            x++;
        }
        
       
        while (p != null) {
            cursor.next = new ListNode(p.val);
            cursor = cursor.next;
            p = p.next;
        }
        
        return rev.next;
    }
}