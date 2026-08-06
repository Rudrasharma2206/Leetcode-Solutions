class Solution {
    public boolean canJump(int[] arr) {
        int maxInd=0;
        for(int i=0;i<arr.length;i++){
            if(i>maxInd){
                return false;
            }
            maxInd = Math.max(maxInd, i + arr[i]);
            if (maxInd >= arr.length - 1) {
                return true;
            }
        }
        return true;
    }
}