class Solution {
    public int rob(int[] arr) {
        int n=arr.length;
        if(n<2){
            return arr[0];
        }
        int[] temp=new int[n];
        temp[0]=arr[0];
        temp[1]=Math.max(arr[0],arr[1]);
        for(int i=2;i<n;i++){
            temp[i]=Math.max(temp[i-1],arr[i]+temp[i-2]);
        }
        return temp[n-1];
    }
}