class Solution {
    public boolean isPalindrome(String s) {
        if(s.length() == 1){
            return true;
        }
        String cleanString = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        for(int i = 0 ; i < cleanString.length()/2 ; i++){
            if(cleanString.charAt(i) != cleanString.charAt(cleanString.length() - 1 - i))
            {
                return false;
            }
        }
        return true;
    }
}