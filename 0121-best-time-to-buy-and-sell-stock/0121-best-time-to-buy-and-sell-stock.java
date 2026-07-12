class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        
        for (int i = 0; i < prices.length; i++) {
            // If today's price is cheaper than anything we've seen, update minPrice
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else if (prices[i] - minPrice > maxProfit) {
                // Otherwise, see if selling today gives us a better profit than before
                maxProfit = prices[i] - minPrice;
            }
        }
        
        return maxProfit;
    }
}