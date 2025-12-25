class Solution {
    public int maxProfit(int[] prices) {
        
        int l = Integer.MAX_VALUE, max=0;
        for(int i=0; i<prices.length; i++){
            if(prices[i]<l) l=prices[i];

            max = max>prices[i]-l?max:prices[i]-l;
        }

        return max;
    }
}