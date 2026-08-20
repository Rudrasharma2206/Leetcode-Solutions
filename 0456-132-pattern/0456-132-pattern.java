class Solution {
    public boolean find132pattern(int[] nums) {
        if (nums == null || nums.length < 3) {
            return false;
        }
        
        int s3 = Integer.MIN_VALUE;
        java.util.Stack<Integer> stack = new java.util.Stack<>();
        
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] < s3) {
                return true;
            }
            
            // Check emptiness FIRST
            while (!stack.isEmpty() && stack.peek() < nums[i]) {
                s3 = stack.pop();
            }
            
            stack.push(nums[i]);
        }
        
        return false;
    }
}