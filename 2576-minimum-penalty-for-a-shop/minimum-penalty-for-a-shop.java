class Solution {
    public int bestClosingTime(String c) {
        int[] op = new int[c.length()+1];
        int[] cl = new int[c.length()+1];

        int openSum =0;
        for(int i=0; i<c.length() ; i++){
            char o = c.charAt(i);
            openSum = o == 'N'?openSum+1:openSum;
            op[i+1]= openSum; 
        }
        int closedSum =0;
        for(int i= c.length()-1; i>=0 ; i--){
            char o = c.charAt(i);
            closedSum = o == 'Y'?closedSum+1:closedSum; 
            cl[i]= closedSum;
        }

        int max=Integer.MAX_VALUE;
        int ind = 0;
        for(int i=0; i<cl.length; i++){
            int ss = op[i] + cl[i];

            if(ss<max){
                max=ss;
                ind=i;
            }
        }

        return ind;

    }
}