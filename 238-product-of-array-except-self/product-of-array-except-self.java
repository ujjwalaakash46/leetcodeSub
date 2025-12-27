class Solution {
    public int[] productExceptSelf(int[] n) {
        int l = n.length;
        int[] pre = new int[l];
        // int[] post = new int[l];


        int pro = 1;
        for(int i=0; i<l; i++){
            pre[i]=pro;
            pro *= n[i];
        }

        pro = 1;
        for(int i=l-1; i>=0; i--){
            pre[i]*=pro;
            pro *= n[i];
        }

        // for(int i=0; i<l; i++){
        //     n[i]=pre[i]*post[i];
        // }

        return pre;

    }
}