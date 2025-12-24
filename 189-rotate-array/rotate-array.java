class Solution {
    public void rotate(int[] nums, int k) {
        int[] og = nums.clone();
        int len = nums.length;
        int ro = k%len;
        
        int i=0, j=0;
        while(ro>i){
            nums[i]=og[len+i-ro];
            i++;
        }
        while(i<len){
            nums[i]=og[j];
            i++;
            j++;
        }

        // while(i<len){
        //     nums[i]=og[k - len + i];
        //     i++;
        // }

    }
}