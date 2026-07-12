class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int sum=0;
        for(int i=0;i<operations.length;i++){
            String x=operations[i];
            if(x.equals("++X") || x.equals("X++")){
                sum++;
            }
            else{
                sum--;
            }
        }
        return sum;
    }
}