class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int[] newN = new int[n];

        k = k % n;

        for(int i=0; i<n; i++){
            if(k<=i){
                newN[i]= nums[i-k];
            }else{
                newN[i]= nums[n-k+i];
            }
        }
        for(int i=0; i<n; i++){
            nums[i]=newN[i];

        }
    }
}