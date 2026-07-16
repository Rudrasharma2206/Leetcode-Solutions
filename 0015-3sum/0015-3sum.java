class Solution {
public static List<List<Integer>> threeSum(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = arr.length;
        
        Arrays.sort(arr); // Sort first

        for (int i = 0; i < n; i++) {
            // Skip duplicate values for the first element
            if (i > 0 && arr[i] == arr[i - 1]) continue;

            Set<Integer> seen = new HashSet<>();
            for (int j = i + 1; j < n; j++) {
                int third = -(arr[i] + arr[j]);
                
                if (seen.contains(third)) {
                    ans.add(Arrays.asList(arr[i], arr[j], third));
                    
                    // Skip duplicates for the second element to avoid adding the same triplet again
                    while (j + 1 < n && arr[j] == arr[j + 1]) {
                        j++;
                    }
                }
                seen.add(arr[j]);
            }
        }
        return ans;
    }
}