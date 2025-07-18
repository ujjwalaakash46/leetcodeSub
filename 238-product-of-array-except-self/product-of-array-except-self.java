class Solution {
    public int[] productExceptSelf(int[] n) {
        int[] post = new int[n.length];

        int pro=1; 
        for(int i=n.length-1; i>=0; i-- ){
            post[i]=pro;
            pro *= n[i];
        }

        int prip=1;
        int[] res = new int[n.length];
        for(int i=0; i<n.length; i++){
            res[i] = prip*post[i];
            prip *=n[i];
        }

        return res;
    }
}