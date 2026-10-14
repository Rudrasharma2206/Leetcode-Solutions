class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> map=new HashMap<>();
        int maxLen=0;
        int maxFreq=0;
        int j=0;
        for(int i=0;i<s.length();i++){
            Character c=s.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
            maxFreq=Math.max(maxFreq,map.get(c));
            while((i-j+1)-maxFreq>k){
                map.put(s.charAt(j),map.get(s.charAt(j))-1);
                j++;
            }
            maxLen=Math.max(maxLen,i-j+1);
        }
        return maxLen;
    }
}