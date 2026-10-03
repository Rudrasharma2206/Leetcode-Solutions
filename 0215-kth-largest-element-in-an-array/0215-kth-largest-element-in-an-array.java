

class Solution {
    public int findKthLargest(int[] nums, int k) {
        // Min-heap to store the k largest elements seen so far
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        
        for (int num : nums) {
            minHeap.add(num);
            if (minHeap.size() > k) {
                minHeap.poll(); // Remove the smallest element
            }
        }
        
        return minHeap.peek();
    }
}