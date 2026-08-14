import java.util.Arrays;

public class Solution {
    public static int[] nextGreaterElements(int[] arr) {
        int n = arr.length;
        int[] res = new int[n];
        
        Arrays.fill(res, -1);
        
        int i = 0;
        int j = 0;
        
        while (i < n) {
            j = i + 1;
            while (i != (j % n)) {
                if (arr[j % n] > arr[i]) {
                    res[i] = arr[j % n]; 
                    break;
                }
                j++;
            }
            i++;
        }
      
        return res;
    }
}