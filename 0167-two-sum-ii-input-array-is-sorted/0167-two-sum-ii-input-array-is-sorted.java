class Solution {
    public int[] twoSum(int[] arr, int target) {
        int i=0;
        int n=arr.length;
        int j=n-1;
        int[] ans=new int[2];
        while(i<n-1 && j>=0){
            int sum=arr[i]+arr[j];
            if(sum>target){
                j--;
            }
            else if(sum<target){
                i++;
            }
            else{
                ans[0]=i+1;
                ans[1]=j+1;
                break;
            }
        }
        return ans;
    }
}