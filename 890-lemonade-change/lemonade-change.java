class Solution {
    public boolean lemonadeChange(int[] bills) {
        
        int coin[] = new int[2];

        for(int b : bills){
            if(b==5) coin[0]++;
            else if(b==10){
                if(coin[0]<1) return false;
                coin[0]--;
                coin[1]++;
            }else {
                if(coin[0]>0 && coin[1]>0){
                    coin[0]--; coin[1]--;
                }else if(coin[0]>=3){
                    coin[0]-=3;
                }else{
                    return false;
                }
                
            }
        }

        return true;
    }
}