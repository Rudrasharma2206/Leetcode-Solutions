import java.util.Arrays;

class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        
        // Fill array with amount + 1 as an upper bound sentinel value
        Arrays.fill(dp, amount + 1);
        
        // Base case: 0 amount requires 0 coins
        dp[0] = 0;
        
        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                // Check if current coin value can fit in amount i
                if (i >= coin) {
                    dp[i] = Math.min(dp[i], 1 + dp[i - coin]);
                }
            }
        }
        
        // If dp[amount] wasn't updated, amount cannot be formed
        return dp[amount] > amount ? -1 : dp[amount];
    }
}