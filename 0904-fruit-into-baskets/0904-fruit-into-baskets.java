import java.util.HashSet;

class Solution {
    public int totalFruit(int[] fruits) {
        HashSet<Integer> set = new HashSet<>();
        int maxFruits = 0;
        int j = 0; // Left pointer of the window

        for (int i = 0; i < fruits.length; i++) {
            // If we find a 3rd type of fruit, we must drop the older fruit type
            if (set.size() == 2 && !set.contains(fruits[i])) {
                set.clear();
                
                // Keep only the current fruit and the immediate previous fruit type
                set.add(fruits[i]);
                set.add(fruits[i - 1]);
                
                // Scan j backward to find the absolute beginning of the continuous previous fruit streak
                j = i - 1;
                while (j > 0 && fruits[j - 1] == fruits[j]) {
                    j--;
                }
            } else {
                set.add(fruits[i]);
            }

            // The window length (i - j + 1) represents the total fruits in our baskets
            maxFruits = Math.max(maxFruits, i - j + 1);
        }

        return maxFruits;
    }
}