class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum =0;
        int max =Integer.MIN_VALUE;
        int j=0;
        for(int i=0; i<nums.length; i++){
            if(i<k){
                sum += nums[i];
            }   else{
                max = Math.max(max, sum);
                sum = sum - nums[j++] + nums[i];
            }
        }
        max = Math.max(max, sum);

        return (double) max/k;
    }
}