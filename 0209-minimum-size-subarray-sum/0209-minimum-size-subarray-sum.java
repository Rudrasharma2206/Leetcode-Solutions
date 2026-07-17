class Solution {
public static int minSubArrayLen(int target, int[] arr) {
        int n=arr.length;
        int i=0;
        int j=0;
        int ans=Integer.MAX_VALUE;
        int sum=arr[0];
        while(j<n){

            if(sum>=target){
                ans=Math.min(ans,j-i+1);
                sum-=arr[i];
                i++;
            }
            else{
                if(j<n-1){
                    j++;
                    sum+=arr[j];
                }
                else{
                    break;
                }
            }



        }
        if (ans==Integer.MAX_VALUE) return 0;
        return ans;

    }
}