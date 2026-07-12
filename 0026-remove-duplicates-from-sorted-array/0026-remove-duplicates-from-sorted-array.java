class Solution {
    public int removeDuplicates(int[] nums) {
        int n= nums.length;
        int[] temp=new int[n];
        int k=1;
        temp[0]=nums[0];
        int index=1;
        for(int i=1;i<n;i++){
            if(nums[i]!=nums[i-1]){
                temp[index++]=nums[i];
                k++;
            }
        }
        for(int i=0;i<n;i++){
            nums[i]=temp[i];
        }
        return k;
    }
}