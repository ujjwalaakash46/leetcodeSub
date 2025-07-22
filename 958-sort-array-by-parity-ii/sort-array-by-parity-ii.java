class Solution {
    public int[] sortArrayByParityII(int[] n) {
        int i=0, j=1;

        while( i< n.length && j<n.length){
            if(n[i]%2!=0 && n[j]%2==0){
                int g = n[i];
                n[i] = n[j];
                n[j] = g;
                i+=2; j+=2;
            }else if(n[i]%2==0){
                i+=2;
            }else if(n[j]%2!=0){
                j+=2;
            }else{
                i+=2; j+=2;
            }
        }
        return n;
    }
}