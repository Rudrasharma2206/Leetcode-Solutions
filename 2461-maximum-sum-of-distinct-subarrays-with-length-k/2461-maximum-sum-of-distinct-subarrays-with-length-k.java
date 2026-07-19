class Solution {
    public static long maximumSubarraySum(int[] arr, int k) {
        HashSet<Integer> set=new HashSet<>();
        long curr = 0,sum=0;
        int j=0;
        for(int i=0;i<arr.length;i++){
            while(set.contains(arr[i])){
                curr-=arr[j];
                set.remove(arr[j]);
                j++;
            }
            set.add(arr[i]);
            curr+=arr[i];
            if(i-j+1>k){
                curr-=arr[j];
                set.remove(arr[j]);
                j++;
            }
            if(i-j+1==k){
                sum=Math.max(sum,curr);
            }
        }
        return sum;

    }
}