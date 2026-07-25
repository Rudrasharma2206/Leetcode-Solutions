public class Solution {
    public static int numSubarrayProductLessThanK(int[] arr, int k) {
        // Edge case: Since array elements are positive (>= 1),
        // no contiguous product can be strictly less than k if k <= 1.
        if (k <= 1) {
            return 0;
        }

        int count = 0;
        int product = 1;
        int j = 0; // Left pointer of the window

        // Expand the window with the right pointer i
        for (int i = 0; i < arr.length; i++) {
            product *= arr[i];

            // Shrink the window from the left until product < k
            while (product >= k && j <= i) {
                product /= arr[j];
                j++;
            }

            // The number of valid contiguous subarrays ending at index i
            // is equal to the size of the window: (i - j + 1)
            count += (i - j + 1);
        }

        return count;
    }
}
