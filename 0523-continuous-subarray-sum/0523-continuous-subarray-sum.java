import java.util.HashMap;

public class Solution {
    public boolean checkSubarraySum(int[] arr, int k) {
        // Map stores <Remainder, First Seen Index>
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // Base case: remainder 0 before starting array has virtual index -1
        map.put(0, -1);
        
        int runningSum = 0;

        for (int i = 0; i < arr.length; i++) {
            runningSum += arr[i];
            
            int remainder = runningSum % k;
            
            // Check if this remainder was seen before
            if (map.containsKey(remainder)) {
                // Ensure subarray length is at least 2
                if (i - map.get(remainder) > 1) {
                    return true;
                }
            } else {
                // Only store index on FIRST occurrence to keep subarray as long as possible
                map.put(remainder, i);
            }
        }

        return false;
    }
}