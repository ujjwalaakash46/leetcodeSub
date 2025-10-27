class Solution {
    public boolean lemonadeChange(int[] bills) {
        
        int coin[] = new int[2];

        for(int b : bills){
            if(b==5) coin[0]++;
            else if(b==10){
                if(coin[0]<1) return false;
                coin[0]--;
                coin[1]++;
            }else if(b==20){
                int sum = coin[0]*5 + coin[1]*10;
                if(sum<15){
                    return false;
                }
                int cur = 15;
                
                if(coin[1]>=1){
                    coin[1]--;
                    cur-=10;
                }
                if(cur>5*coin[0]){
                    return false;
                }
                else{
                    while(cur>0){
                        cur-=5;
                        coin[0]--;
                    }
                }
                
            }
        }

        return true;
    }
}