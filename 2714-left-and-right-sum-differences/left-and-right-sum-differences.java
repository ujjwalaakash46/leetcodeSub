class Solution {
    public int[] leftRightDifference(int[] n) {
        int[] res = new int[n.length];

        int s = 0;
        for(int i=0; i<n.length; i++){
            res[i] = s;
            s += n[i];
        }

        int ss =0;
        for(int i=n.length-1; i>=0; i--){
            res[i] = res[i]>ss?res[i]-ss:ss-res[i];
            ss +=n[i]; 
        }

        return res;
    }
}