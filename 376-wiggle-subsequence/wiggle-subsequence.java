class Solution {
    public int wiggleMaxLength(int[] n) {
        
        int c=1, p=n[0];
        if(n.length==1) return c;
        boolean di=true, diSet=false;
        for(int i=1; i<n.length; i++){
            if(!diSet && p!=n[i] ){
                di=p<n[i];
                p=n[i];
                c++;
                diSet=true;
                continue;
            }
            if((di && p>n[i]) || (!di && p<n[i])){
                di=!di;
                p=n[i];
                c++;
            }else{
                if((di && p<n[i])||(!di && p>n[i])) p=n[i];
            }
        }
        return c;
    }
}