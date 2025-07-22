class Solution {
    public int[] sortArrayByParity(int[] n) {
        int i=0, j=0;
        while(j<n.length){
            if(n[j]%2==0){
                int g = n[j];
                n[j]=n[i];
                n[i] = g;
                i++;
            }
            j++;
        }
        return n;
    }
}