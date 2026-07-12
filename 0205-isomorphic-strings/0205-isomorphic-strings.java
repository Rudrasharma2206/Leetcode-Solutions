class Solution {
public boolean isIsomorphic(String s, String t) {
    // If lengths are different, they cannot be isomorphic
    if (s.length() != t.length()) {
        return false;
    }
    
    // Maps a character in 's' to a character in 't'
    HashMap<Character, Character> map = new HashMap<>();
    // Keeps track of characters in 't' that are already "claimed"
    HashSet<Character> assignedValues = new HashSet<>();
    
    for (int i = 0; i < s.length(); i++) {
        char charS = s.charAt(i);
        char charT = t.charAt(i);
        
        // Scenario 1: We have seen charS before
        if (map.containsKey(charS)) {
            // Check if it maps to the same charT as before
            if (map.get(charS) != charT) {
                return false; 
            }
        } 
        // Scenario 2: We haven't seen charS before
        else {
            // Check if charT has already been taken by a different character
            if (assignedValues.contains(charT)) {
                return false; 
            }
            
             
            map.put(charS, charT);
            assignedValues.add(charT);
        }
    }
    
    return true;
}
}