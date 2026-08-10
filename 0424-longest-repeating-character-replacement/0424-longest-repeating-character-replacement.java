class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int j = 0; // Left pointer of the window
        int maxFrequency = 0; // Max frequency of any single character in current window
        int maxLen = 0; // Longest valid substring length

        for (int i = 0; i < s.length(); i++) {
            char rightChar = s.charAt(i);
            freq[rightChar - 'A']++;
            
            // Track the highest frequency of a single character in the window
            maxFrequency = Math.max(maxFrequency, freq[rightChar - 'A']);

            int windowLength = i - j + 1;

            // If changes needed (windowLength - maxFrequency) exceed k, shrink window from left
            while ((windowLength - maxFrequency) > k) {
                char leftChar = s.charAt(j);
                freq[leftChar - 'A']--;
                j++;
                windowLength = i - j + 1;
            }

            maxLen = Math.max(maxLen, windowLength);
        }

        return maxLen;
    }
}