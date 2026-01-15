class Solution {
    public int[] diStringMatch(String s) {
        int n = s.length();
        int[] a = new int[s.length()+1];
        int l=0, r=s.length();
        for (int i = 0; i < n; i++) {
            if(s.charAt(i)=='I'){
                a[i]=l++;
            }else{
                a[i]=r--;
            }
        }
        a[n]=r;

        return a;
    }
}