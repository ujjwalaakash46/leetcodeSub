class Solution {
    public int jump(int[] n) {
        if(n.length==1) return 0;
        int nextMaxIRange = 0, steps = 0, lastRange=0;
        
        for(int i=0; i<n.length-1; i++){
            nextMaxIRange= Math.max(nextMaxIRange, i + n[i]);
            if(i == lastRange){
                steps++;
                lastRange = nextMaxIRange;
            }
        }    


        return steps;
    }
}

