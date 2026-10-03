class Solution {
    public int maxProfit(int[] arr) {
        int max=0;
        int curr=0;
        int buy_price=arr[0];
        for (int i=1;i<arr.length;i++){
            if(buy_price>arr[i]){
                buy_price=arr[i];
            } 
            else{
                curr=arr[i]-buy_price;
                max=Math.max(curr,max);
            }
        }
        return max;
    }
}