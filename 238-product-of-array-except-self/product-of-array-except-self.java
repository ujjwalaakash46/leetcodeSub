class Solution {
    public int[] productExceptSelf(int[] n) {
        int[] pre = new int[n.length];
        int[] post = new int[n.length];

        int pro=1; 
        for(int i=0; i<n.length; i++ ){
            pre[i]=pro;
            pro *= n[i];
        }

        pro=1; 
        for(int i=n.length-1; i>=0; i-- ){
            post[i]=pro;
            pro *= n[i];
        }

        int[] res = new int[n.length];
        for(int i=0; i<n.length; i++){

            res[i] = pre[i]*post[i];
        }

        return res;
    }
}