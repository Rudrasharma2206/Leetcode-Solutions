class Solution {
        public static boolean checkInclusion(String s1, String s2) {
    if (s1.length() > s2.length()) return false;

    int[] map1 = new int[26];
    int[] map2 = new int[26];
    int n = s1.length();

    // Populate frequency for s1 and the first window of s2
    for (int i = 0; i < n; i++) {
        map1[s1.charAt(i) - 'a']++;
        map2[s2.charAt(i) - 'a']++;
    }

    // Slide the window across s2
    for (int i = n; i < s2.length(); i++) {
        // 1. Check if current windows match
        if (Arrays.equals(map1, map2)) return true;

        // 2. Add new character entering from right
        map2[s2.charAt(i) - 'a']++;

        // 3. Remove character leaving from left
        map2[s2.charAt(i - n) - 'a']--;
    }

    // Check final window state
    return Arrays.equals(map1, map2);
}
}