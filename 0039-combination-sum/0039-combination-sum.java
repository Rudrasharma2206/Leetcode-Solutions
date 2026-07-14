class Solution {
    private void sum(int i, int[] arr, int target, List<Integer> list, List<List<Integer>> data){
        if(i==arr.length){
            if(target==0){
                data.add(new ArrayList<>(list));
                
            }
            return;
        }
        if(target>=arr[i]){
            list.add(arr[i]);
            sum(i,arr,target-arr[i],list,data);
            list.remove(list.size()-1);

        }
        sum(i+1,arr,target,list,data);


    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        sum(0,candidates,target,new ArrayList<>(),list);
        return list;
    }
}