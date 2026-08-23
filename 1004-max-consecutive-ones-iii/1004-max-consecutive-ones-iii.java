class Solution {
    public int longestOnes(int[] arr, int k) {
    int zero = 0;   // Count of zeros in our current window
    int j = 0;      // Left pointer
    int ans = 0;    // Max window size

    for (int i = 0; i < arr.length; i++) {
        // 1. Expand the window by including arr[i]
        if (arr[i] == 0) {
            zero++;
        }
        
        // 2. Shrink the window if it's invalid (too many zeros)
        while (zero > k) {
            if (arr[j] == 0) {
                zero--;
            }
            j++; // Move the left pointer forward
        }
        
        // 3. Update the maximum size found so far
        // The current valid window size is (right pointer - left pointer + 1)
        ans = Math.max(ans, i - j + 1); 
    }
    
    return ans;
}
}