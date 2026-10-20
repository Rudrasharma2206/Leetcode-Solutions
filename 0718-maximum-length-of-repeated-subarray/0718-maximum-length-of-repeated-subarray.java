class Solution {
    public int findLength(int[] arr1, int[] arr2) {
        int[][] dp=new int[arr1.length+1][arr2.length+1];
        int max=0;
        for(int i=1;i<=arr1.length;i++){
            for(int j=1;j<=arr2.length;j++){
                if(arr1[i-1]==arr2[j-1]){
                    dp[i][j]=dp[i-1][j-1]+1;
                    max=Math.max(dp[i][j],max);
                }
            }
        }
        return max;
    }
}