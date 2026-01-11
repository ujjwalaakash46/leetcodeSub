class Solution {
    public int[] twoSum(int[] n, int target) {
        int l=0, r=n.length-1;

        while(l<r){
            int m = (l+r)/2;
            int sum = n[r]+n[l];
            if(sum==target){
                break;
            }else if (sum<target){
                l++;
            }else r--;
        }
        return new int[]{l+1,r+1};
    }
}