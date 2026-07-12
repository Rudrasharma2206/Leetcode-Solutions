class Solution {
       public static String reverseWords(String s) {
    // 1. Reverse the entire string first
    String ans = reverse(s);
    int n = ans.length();
    
    String rev_ans = "";
    String solu = "";
    
    // 2. Loop through the reversed string
    for (int i = 0; i < n; i++) {
        
        // Skip any leading or extra spaces between words
        if (ans.charAt(i) == ' ') {
            continue;
        }

        // Extract a single word safely (Fix #1)
        while (i < n && ans.charAt(i) != ' ') {
            rev_ans += ans.charAt(i);
            i++;
        }
        
        // 3. Reverse the word back to its original order and add to solution
        // If solu is not empty, add a space BEFORE the next word (Fix #3)
        if (solu.length() == 0) {
            solu += reverse(rev_ans);
        } else {
            solu += " " + reverse(rev_ans);
        }
        
        // Reset for the next word
        rev_ans = "";
    }
    
    return solu;
}

public static String reverse(String s) {
    int n = s.length();
    String ans = "";
    for (int i = n - 1; i >= 0; i--) {
        ans += s.charAt(i);
    }
    return ans;
}
}