import java.util.*;

public class Solution {
    public int[] avoidFlood(int[] rains) {
        int n = rains.length;
        int[] ans = new int[n];
        HashMap<Integer, Integer> full = new HashMap<>();
        TreeSet<Integer> dryDays = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            if (rains[i] > 0) {
                int lake = rains[i];
                if (full.containsKey(lake)) {
                    Integer dryDay = dryDays.higher(full.get(lake));
                    if (dryDay == null) {
                        return new int[0]; // Flood unavoidable
                    }
                    ans[dryDay] = lake; // Dry this lake on that day
                    dryDays.remove(dryDay);
                }
                full.put(lake, i);
                ans[i] = -1;
            } else {
                dryDays.add(i);
                ans[i] = 1; // Default; can be replaced later
            }
        }
        return ans;
    }
}
