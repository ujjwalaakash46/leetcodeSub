class Solution {
    public String longestCommonPrefix(String[] strs) {
        int max = 0;
        String prefix = strs[0];
        for(int i=1; i<strs.length; i++){
            int j=0;
            for(char c : prefix.toCharArray()){
                if(j>= strs[i].length() || c != strs[i].charAt(j)){
                    prefix = prefix.substring(0,j);
                    break;
                }
                j++;
            }
        }

        return prefix;
    }
}