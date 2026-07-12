class Solution{
    public static int myAtoi(String s) {
        String trim = s.trim();
        if (trim.isEmpty()) return 0; // LeetCode expects 0 for empty strings, not -1

        int i = 0;
        long ans = 0; // Use long to safely detect overflow
        int sign = 1;

        // 1. Handle the sign if it exists at the very start
        if (trim.charAt(0) == '-') {
            sign = -1;
            i++;
        } else if (trim.charAt(0) == '+') {
            sign = 1;
            i++;
        }

        // 2. Process digits
        while (i < trim.length() && Character.isDigit(trim.charAt(i))) {
            char x = trim.charAt(i);
            ans = (ans * 10) + (x - '0');

            // 3. Check overflow/underflow in real-time
            if (ans * sign > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if (ans * sign < Integer.MIN_VALUE) return Integer.MIN_VALUE;

            i++; // Crucial: increment the pointer!
        }

        return (int) (ans * sign);
    }}