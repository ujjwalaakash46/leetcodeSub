class Solution {
    public int[] vowelStrings(String[] w, int[][] q) {
        int[] ans = new int[q.length];

        int[] pre = new int[w.length];

        int sum=0;
        for(int i=0; i<w.length; i++){
            if(isVal(w[i])){
                sum++;
            }
            pre[i] = sum;
        }
        int i=0;
        for(int[] a: q){
            ans [i++] = pre[a[1]] - ( a[0]==0?0: pre[a[0]-1] );
        }

        //1,1,2,3,4

        return ans;
    }

    public boolean isVal(String s){
        boolean f = false;
        boolean l = false;

        char fs = s.charAt(0);
        char ls = s.charAt(s.length()-1);

        if(fs == 'a' || fs =='e' || fs == 'i' || fs =='o' || fs =='u')f=true;
        if(ls == 'a' || ls =='e' || ls == 'i' || ls =='o' || ls =='u')l=true;
        // System.out.println(f);
        // System.out.println(l);
        return f && l;

    }
}