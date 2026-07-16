class Solution {
    public static int maxArea(int[] arr) {
        int n=arr.length;
        int i=0;
        int j=n-1;
        int ans=0;
        while(i<n-1 && j>=0){
            int sum=(Math.min(arr[i],arr[j]))*(j-i);
            if(arr[i]>arr[j]){
                j--;
            }
            else{
                i++;
            }
            ans=Math.max(sum,ans);
        }
        return ans;
    }
}