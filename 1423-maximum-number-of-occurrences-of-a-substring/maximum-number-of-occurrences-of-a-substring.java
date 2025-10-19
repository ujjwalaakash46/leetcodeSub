class Solution {
    public int maxFreq(String s, int maxLetters, int minSize, int maxSize) {
        HashMap<String, Integer> mp = new HashMap<>();
        HashSet<Character> st = new HashSet<>();
        int l = -1, r = minSize-1;
        while(r<s.length()){
            String cur = s.substring(++l,++r);
            int stSize = reSet(cur).size();
            if(stSize<=maxLetters){
                mp.put(cur, mp.getOrDefault(cur,0)+1);
            }
            
        }
        int mx =0;
        for(Map.Entry<String, Integer> v : mp.entrySet()){
            if(mx<v.getValue()){
                mx=v.getValue();
            }
        }
        return mx;
    }

    public HashSet<Character> reSet(String cur){
        HashSet<Character> st = new HashSet<>();
        for(int i=0; i<cur.length(); i++){
            st.add(cur.charAt(i));
        }
        return st;
    }
}