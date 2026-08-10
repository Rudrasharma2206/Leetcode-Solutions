class Solution {
    public static String convert(String s, int numRows) {
    if (numRows <= 1 || numRows >= s.length()) return s;

    StringBuilder ans = new StringBuilder();
    int cycle = 2 * numRows - 2;
    int j = 0; // Tracks current row
    int rows = numRows;

    while (rows > 0) {
        int i = j; // Start at the first character of row j
        while (i < s.length()) {
            // 1. Append the main column character
            ans.append(s.charAt(i));

            // 2. Append the diagonal character (only for middle rows)
            int diagIndex = i + cycle - 2 * j;
            if (j > 0 && j < numRows - 1 && diagIndex < s.length()) {
                ans.append(s.charAt(diagIndex));
            }

            // Move pointer to the next full cycle
            i += cycle; 
        }
        rows--;
        j++;
    }

    return ans.toString();
}
}