class Solution {
    public double myPow(double x, int n) {
        // Base case
        if (n == 0) return 1.0;

        // Handle the Integer.MIN_VALUE overflow case directly
        if (n == Integer.MIN_VALUE) {
            return (1 / x) * myPow(1 / x, Integer.MAX_VALUE);
        }

        // Handle regular negative exponents safely
        if (n < 0) {
            n = -n;
            x = 1 / x;
        }

        // Recursive step
        double half = myPow(x, n / 2);

        if (n % 2 == 0) {
            return half * half;
        } else {
            return x * half * half;
        }
    }
}