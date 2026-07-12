class Solution {
    public int majorityElement(int[] arr) {
        int n=arr.length;
        int count=1;
        int curr=arr[0];
        int i=1;
        while(i<n){
            if(curr==arr[i]){
                count++;
            }
            else{
                count--;
            }
            if(count==0){
                curr=arr[i];
                count=1;
            }
            i++;

        }
        return curr;

        
    }
}