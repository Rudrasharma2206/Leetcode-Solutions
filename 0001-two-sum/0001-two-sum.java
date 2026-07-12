class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i=0;
        int j=nums.length-1;
        int[] temp=new int[2];
        Arrays.sort(nums);
        while(i<=j){
            int sum=nums[i]+nums[j];
            if(sum>target){
                j--;
            }
            else if(sum<target){
                i++;
            }
            else{ 
                temp[0]=i;
                temp[1]=j;
                break;
            }
            
        }
        return temp;
    }
}