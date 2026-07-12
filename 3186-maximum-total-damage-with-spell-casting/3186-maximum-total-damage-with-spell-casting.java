import java.util.*;

class Solution {
    public long maximumTotalDamage(int[] power) {
        // Step 1: Count total damage for each unique spell value
        Map<Integer, Long> total = new HashMap<>();
        for (int p : power) {
            total.put(p, total.getOrDefault(p, 0L) + p);
        }

        // Step 2: Sort all unique damage values
        List<Integer> keys = new ArrayList<>(total.keySet());
        Collections.sort(keys);

        int n = keys.size();
        long[] dp = new long[n];
        dp[0] = total.get(keys.get(0));

        // Step 3: DP to choose spells without conflicts
        for (int i = 1; i < n; i++) {
            long include = total.get(keys.get(i));
            int j = i - 1;

            // Find the nearest previous non-conflicting spell
            while (j >= 0 && keys.get(i) - keys.get(j) <= 2) {
                j--;
            }

            if (j >= 0) include += dp[j];
            dp[i] = Math.max(dp[i - 1], include);
        }

        // Step 4: Final answer
        return dp[n - 1];
    }

    
}
