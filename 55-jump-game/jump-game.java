class Solution {
    public boolean canJump(int[] nums) {
        int curZero = 0;
        // if(nums.length==0 || nums.length==1) return true;

        for(int i=nums.length-2; i>=0; i--){
            if(nums[i]==0){
                curZero++;
            }else if(nums[i]>=curZero+1){
                curZero=0;
            }else if(curZero !=0){
                curZero++;
            }
        }

        return curZero ==0;
    }
}