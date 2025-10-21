class Solution {
    public int maximizeSum(int[] nums, int k) {
        int max = 0;

        for(int n: nums){
            max=max>n?max:n;
        }

        int res = 0;
        for(int i=0; i<k; i++){
            res = res + max + i;
        }

        return res;
    }
}