class Solution {
    public int subarraysDivByK(int[] arr, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int preSum=0;
        int ans=0;
        for(int i=0;i<arr.length;i++){
            preSum+=arr[i];
            int rem=preSum%k;
            if(rem<0){
                rem+=k;
            }
            ans += map.getOrDefault(rem, 0);
            map.put(rem, map.getOrDefault(rem, 0) + 1);

        }
        return ans;
    }
}