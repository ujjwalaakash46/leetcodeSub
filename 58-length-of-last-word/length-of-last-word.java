class Solution {
    public int lengthOfLastWord(String s) {
        String[] sl = s.trim().split("\\s+");
        return sl[sl.length-1].length();
    }
}