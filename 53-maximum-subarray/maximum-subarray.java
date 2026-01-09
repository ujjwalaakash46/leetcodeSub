class Solution {
    public int maxSubArray(int[] nums) {
        int max=Integer.MIN_VALUE, cur=0;

        for(int i : nums){
            cur+=i;
            max = Math.max(max, cur);
            cur = Math.max(0, cur);
        }
        return max;
    }
}