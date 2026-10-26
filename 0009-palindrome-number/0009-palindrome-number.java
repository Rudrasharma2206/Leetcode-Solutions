class Solution {
    public boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        int n=str.length();
        for(int i=0;i<n;i++){
            if(str.charAt(i)!=str.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }
}