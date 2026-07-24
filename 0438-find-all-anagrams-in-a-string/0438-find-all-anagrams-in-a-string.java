class Solution {
    public static List<Integer> findAnagrams(String s, String p) {
    List<Integer> result = new ArrayList<>(); // 1. Change return type to a List
    
    if (s.length() < p.length()) return result;

    HashMap<Character, Integer> map1 = new HashMap<>();
    HashMap<Character, Integer> map2 = new HashMap<>();
    int n = p.length();

    // Map out target string p
    for (int i = 0; i < n; i++) {
        Character x = p.charAt(i);
        map1.put(x, map1.getOrDefault(x, 0) + 1);
    }

    int j = 0;
    for (int i = 0; i < s.length(); i++) {
        Character y = s.charAt(i);
        map2.put(y, map2.getOrDefault(y, 0) + 1);

        if (i - j + 1 == n) {
            if (map1.equals(map2)) {
                result.add(j); // 2. Add starting index 'j' instead of returning true
            }

            Character leftChar = s.charAt(j);
            map2.put(leftChar, map2.get(leftChar) - 1);

            if (map2.get(leftChar) == 0) {
                map2.remove(leftChar);
            }
            j++;
        }
    }

    return result; // 3. Return the populated list
}
}