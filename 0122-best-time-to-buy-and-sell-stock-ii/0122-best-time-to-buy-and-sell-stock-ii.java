class Solution {
    public int maxProfit(int[] arr) {
        int sum=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i+1]>arr[i]){
                sum+=arr[i+1]-arr[i];
            }
        }
        return sum;
    }
}