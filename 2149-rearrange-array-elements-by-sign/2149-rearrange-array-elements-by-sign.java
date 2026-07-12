class Solution {
    public int[] rearrangeArray(int[] arr) {
        int n=arr.length;
        int[] positive= new int[n/2];
        int[] negative=new int[n/2];
        int index1=0;
        int index2=0;
        for(int i=0;i<n;i++){

            if(arr[i]>0){
                positive[index1++]=arr[i];
            }
            else{
                negative[index2++]=arr[i];
            }
        }  
        for(int i=0;i<n/2;i++){

                arr[2*i]=positive[i];
                arr[2*i+1]=negative[i];
            
        }
        return arr;
    }
}