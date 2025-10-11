class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new LinkedList<>();
        List<Integer> row = new LinkedList<>();

        per(nums, result, new LinkedHashSet<Integer>());
        return result;
    }

    public void per(int[] nums, List<List<Integer>> result, LinkedHashSet<Integer> row){
        if(row.size() == nums.length){
            result.add(new ArrayList<>(row));
            return;
        }

        for(int j=0; j<nums.length; j++){
            if(!row.contains(nums[j])){
                row.add(nums[j]);
                per(nums, result, row);
                row.remove(nums[j]);
            }
        }
    }
}