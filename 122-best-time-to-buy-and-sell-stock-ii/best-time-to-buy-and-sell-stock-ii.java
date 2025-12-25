class Solution {
    public int maxProfit(int[] p) {
        
        int maxp=0, low=Integer.MAX_VALUE, ch=0;
        for(int i=0; i<p.length; i++){
            if(p[i]<ch){
                maxp = maxp + ch -low;
                low = p[i];
                ch = p[i];
            }

            if(p[i]<low){
                low= p[i];
            }

            if(p[i]>ch){
                ch=p[i];
            }
            
        }

        return maxp + ch-low;
    }
}