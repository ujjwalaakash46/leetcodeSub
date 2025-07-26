class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        
        int[] pre = new int[nums.length];

        HashMap<Integer, Integer> mp = new HashMap<>();
        int sum =0;
        int ans=0;
        mp.put(0,1);
        for(int s : nums){
            sum += s;
            int m = sum%k;
            if(m<0) m+=k;

            if(mp.containsKey(m)){
                ans += mp.get(m); 
                mp.put(m, mp.get(m)+1);
            }else{
                mp.put(m,1);
            }
        }

        return ans;
    }
}