class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stack=new Stack<>();
        int n=nums.length;
        
        int[] res=new int[n];
        Arrays.fill(res, -1);
        for(int i=2*n-1;i>=0;i--){ 
            int num=nums[i%n];
            while(!stack.isEmpty() && stack.peek()<=num){
                stack.pop();
            }
            if(i<n && !stack.isEmpty()){
                res[i]=stack.peek();
            }
            stack.push(num);
        }
        return res;

    }
}