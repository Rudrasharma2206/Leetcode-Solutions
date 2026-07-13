public class Solution {
    private long MOD = 1_000_000_007;

    public int countGoodNumbers(long n) {
        // Calculate how many even and odd positions we have
        long evens = (n + 1) / 2;
        long odds = n / 2;

        // Calculate (5^evens * 4^odds) % MOD
        long firstHalf = power(5, evens);
        long secondHalf = power(4, odds);

        return (int) ((firstHalf * secondHalf) % MOD);
    }

    // O(log y) Fast Power Function
    private long power(long x, long y) {
        if (y == 0) return 1;
        
        long half = power(x, y / 2);
        long halfSq = (half * half) % MOD;

        if (y % 2 == 0) {
            return halfSq;
        } else {
            return (halfSq * x) % MOD;
        }
    }
}