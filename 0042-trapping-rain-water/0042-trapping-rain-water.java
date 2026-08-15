class Solution {
    public int trap(int[] arr) {
        int n=arr.length;
        int ans=0;
        int i=0;
        int j=n-1;
        int lmax=0;
        int rmax=0;
        while(i<j){
            lmax=Math.max(lmax,arr[i]);
            rmax=Math.max(rmax,arr[j]);
            if(lmax<rmax){
                ans+=lmax-arr[i];
                i++;
            }
            else{
                ans+=rmax-arr[j];
                j--;
            }
        }
        return ans;

    }
}