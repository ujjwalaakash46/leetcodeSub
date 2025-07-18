class Solution {
    public int[] productExceptSelf(int[] n) {
        int[] res = new int[n.length];

        int pro=1; 
        for(int i=n.length-1; i>=0; i-- ){
            res[i]=pro;
            pro *= n[i];
        }

        int prip=1;
        for(int i=0; i<n.length; i++){
            res[i] *= prip;
            prip *=n[i];
        }

        return res;
    }
}