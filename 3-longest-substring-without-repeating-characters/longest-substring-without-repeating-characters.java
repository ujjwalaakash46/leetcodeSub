class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> mp = new HashMap<>();

        int max =0;
        int l=0;
        for(int r=0; r<s.length(); r++){
            char c = s.charAt(r);
            if(mp.containsKey(c)){
                l = Math.max(mp.get(c)+1, l);
            }
            mp.put(c, r);
            max = Math.max(max, r-l+1);
        }

        return max;
    }
}