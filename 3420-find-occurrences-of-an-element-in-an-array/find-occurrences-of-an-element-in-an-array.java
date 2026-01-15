class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        List<Integer> listIndex = new ArrayList<>();

        int count=0;
        for(int i=0; i<nums.length; i++){
            if(x==nums[i]) listIndex.add(i);
        }

        int[] ans = new int[queries.length];
        for(int i=0; i<queries.length; i++){
            if(queries[i]>listIndex.size()){
                ans[i]=-1;
            }else{
                ans[i]=listIndex.get(queries[i]-1);
            }
        }

        return ans;
    }
}