

class Solution {
    public static int longestConsecutive(int[] arr) {
        // Edge case: empty array
        if (arr.length == 0) {
            return 0;
        }

        Arrays.sort(arr);
        
        int longestSoFar = 1;
        int currentStreak = 1;

        for (int i = 1; i < arr.length; i++) {
            // Skip duplicates
            if (arr[i] == arr[i - 1]) {
                continue;
            }
            
            // If consecutive, increase the current streak
            if (arr[i] == arr[i - 1] + 1) {
                currentStreak++;
            } else {
                // Sequence broke, reset current streak
                currentStreak = 1;
            }
            
            // Keep track of the maximum streak found
            longestSoFar = Math.max(longestSoFar, currentStreak);
        }

        return longestSoFar;
    }
}