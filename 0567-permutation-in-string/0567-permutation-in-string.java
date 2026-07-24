class Solution {
        public static boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()) return false;
        HashMap<Character,Integer> map1=new HashMap<>();
        HashMap<Character,Integer> map2=new HashMap<>();
        int n=s1.length();
        for(int i=0;i<n;i++){
            Character x=s1.charAt(i);
            map1.put(x,map1.getOrDefault(x,0)+1);
        }
        int j=0;
        for(int i=0;i<s2.length();i++){
            Character y=s2.charAt(i);
            map2.put(y,map2.getOrDefault(y,0)+1);
            if(i-j+1==n){
                if(map1.equals(map2)){
                    return true;
                }
                Character leftChar = s2.charAt(j);


                map2.put(leftChar, map2.get(leftChar) - 1);

                if (map2.get(leftChar) == 0) {
                    map2.remove(leftChar);
                }
                j++;
            }
        }
        return false;
    }
}