class Solution {
    public int hIndex(int[] c) {
        // Arrays.sort(c);
        int cc=0, l=c.length, max=0;

        // if(c[0]>l)max=l;

        for(int i =0; i<=l; i++){
            // if(c[i]>cc){
            //     cc=c[i];
            //     // max =Math.max(cc*, )
            // }
            int curMax = 0;
            for(int j=0; j<l; j++){
                if(c[j]>=i)curMax++;
            }

            if(curMax>=i) {
                max = Math.max(curMax, max);
                cc=i;
                }

            // if(i<=(l-i)){
            //     max=c[i];
            // }
        }

        return cc;
    }
}