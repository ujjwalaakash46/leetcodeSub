class Solution {
    public int maximum69Number (int n) {
        int res=0, og = n;
        String nn = String.valueOf(n);
        // for(int i=0; i<nn.length(); i++){
        //     if(nn.charAt(i)=='6'){
        //         nn.replaceFirst("6","9")
        //     }
        // }
        
        return Integer.valueOf(nn.replaceFirst("6","9"));
        // for(n/10!=0){
        //     if(n%10==6){

        //     }
        // }
    }
}