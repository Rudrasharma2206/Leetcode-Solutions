class Solution {
    public int subarraySum(int[] arr, int k) { 
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        int preSum = 0;
        map.put(0, 1);
        
        for (int i = 0; i < arr.length; i++) {
            preSum += arr[i];
            if (map.containsKey(preSum - k)) {
                count += map.get(preSum - k);
            }
            map.put(preSum, map.getOrDefault(preSum, 0) + 1);
        }
        
        return count;
    }
}