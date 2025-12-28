class Solution {
    public boolean isPalindrome(String s) {
        String og = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        int i = 0;
        int len = og.length();
        while(i < len/2){
            if(og.charAt(i) != og.charAt(len-1 - i)) return false;
            i++;
        }
        return true;
    }
}