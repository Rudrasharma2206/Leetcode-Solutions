class Solution {
    public static int[] runningSum(int[] nums) {
        int sum=nums[0];
        int temp=0;
        for(int i=1;i<nums.length;i++){

            nums[i]+=sum;
            temp=nums[i];
            sum=temp;
        }
        return nums;
    }
}