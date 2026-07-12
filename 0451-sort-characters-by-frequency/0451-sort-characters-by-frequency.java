class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> freq = new HashMap<>();  // renamed to freq, fixed HashMap
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            freq.put(c, freq.getOrDefault(c, 0) + 1);    // fixed getOrDefault
        }
        
        List<Character> chars = new ArrayList<>(freq.keySet());
        Collections.sort(chars, (a, b) -> freq.get(b) - freq.get(a));
        
        // Build result string
        StringBuilder sb = new StringBuilder();
        for (char c : chars) {
            for (int i = 0; i < freq.get(c); i++) {
                sb.append(c);
            }
        }  // closing brace for outer for-loop was missing
        
        return sb.toString();  // this was missing entirely
    }
}