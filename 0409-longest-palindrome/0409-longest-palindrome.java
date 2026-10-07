class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int count=0;
        boolean check_odd=false;
        for (int i=0;i<s.length();i++){
            Character c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for(Map.Entry<Character,Integer> entry : map.entrySet()) {
            if(entry.getValue()%2==0){
                count+=entry.getValue();
            }
            else{
                count+=entry.getValue()-1;
                check_odd=true;
            }
        }
        if(check_odd){
            count+=1;
        }
        return count;
        
    }
}