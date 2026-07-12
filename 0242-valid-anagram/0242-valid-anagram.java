

class Solution {
    public static boolean isAnagram(String s, String t) {
        // Step 1: If lengths don't match, they can't be anagrams
        if (s.length() != t.length()) {
            return false;
        }
        
        // Step 2: Convert both strings to char arrays
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        
        // Step 3: Sort both arrays
        Arrays.sort(sChars);
        Arrays.sort(tChars);
        
        // Step 4: Compare the sorted arrays
        return Arrays.equals(sChars, tChars);
    }
}