class Solution {
    public int lengthOfLongestSubstring(String s) {
        int sm = 0;
        int csm = 0;
        int l = 0;

        HashSet<Character> set = new HashSet<>();

        for(int i=0; i<s.length(); i++){

            char c = s.charAt(i);
            if(set.contains(c)){
                for(int j = l; j<i; j++){
                    char sc = s.charAt(j);
                    if(sc!=c){
                        csm--;
                        l++;
                        set.remove(sc);
                    }else{
                        l++;
                        break;
                    }
                }
            }else{
                set.add(c);
                csm++;
                if(sm<csm) sm =csm;
            }
        }

        return sm<csm?csm:sm;
    }
}
