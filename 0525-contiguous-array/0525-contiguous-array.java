import java.util.HashMap;

class Solution {
    public int findMaxLength(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int len = 0;

        // Base case: prefix sum 0 occurs before index 0
        map.put(0, -1);

        for (int i = 0; i < arr.length; i++) {
            // Treat 0 as -1 and 1 as +1
            sum += (arr[i] == 0) ? -1 : 1;

            if (map.containsKey(sum)) {
                // Max length is current index minus first seen index of this sum
                len = Math.max(len, i - map.get(sum));
            } else {
                // Only store first occurrence of sum to maximize length
                map.put(sum, i);
            }
        }

        return len;
    }
}