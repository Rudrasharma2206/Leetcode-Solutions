class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode fast = head;
        ListNode slow = head;
        
        // 1. Move fast pointer k-1 steps ahead
        for (int i = 1; i < k; i++) {
            fast = fast.next;
        }
        
        // Save the k-th node from the start
        ListNode first = fast;
        
        // 2. Move both fast and slow until fast hits the end
        // This will place 'slow' at the k-th node from the end
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        ListNode second = slow;
        
        // 3. Swap their values
        int temp = first.val;
        first.val = second.val;
        second.val = temp;
        
        return head;
    }
}