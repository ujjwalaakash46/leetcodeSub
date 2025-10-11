class Solution {
    List<List<Integer>> res= new ArrayList<>();
    List<Integer> cur = new ArrayList<>();

    public List<List<Integer>> permuteUnique(int[] nums) {
        boolean[] vis = new boolean[nums.length];
        backt(vis, nums);
        return res;
    }

    public void backt(boolean[] vis, int[] nums){
        if(cur.size()==nums.length){
            if(!res.contains(cur)){
                res.add(new ArrayList<>(cur));
            }
            return;
        }
        for(int i=0; i<nums.length; i++){
            if(!vis[i]){
                vis[i]=true;
                cur.add(nums[i]);
                backt(vis, nums);
                cur.remove(cur.size()-1);
                vis[i]=false;
            }
        }

    }
}