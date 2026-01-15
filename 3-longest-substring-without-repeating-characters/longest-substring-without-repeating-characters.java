class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> mp = new HashMap<>();

        int l=0, max=0;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(mp.containsKey(ch)){
                l = Math.max(mp.get(ch)+1, l);
            }
            mp.put(ch, i);
            max = Math.max(max, i-l+1);
        }

        return max;
    }
}