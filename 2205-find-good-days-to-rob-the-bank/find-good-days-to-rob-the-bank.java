class Solution {
    public List<Integer> goodDaysToRobBank(int[] s, int t) {
        
        int[] leftgr = new int[s.length];
        int[] rightgr = new int[s.length];
        List<Integer> res = new LinkedList<>();

        int g=0;
        for(int i =1; i< s.length; i++){
            if(s[i-1]>=s[i]){
                g++;
                leftgr[i]=g;
            }else{
                g=0;
            }
        }

        g=0;
        for(int i =s.length-2; i>= 0; i--){
            if(s[i+1]>=s[i]){
                g++;
                rightgr[i]=g;
            }else{
                g=0;
            }
        }

        System.out.println(Arrays.toString(leftgr));
        System.out.println(Arrays.toString(rightgr));

        for(int i =t; i< s.length-t; i++){
            if(leftgr[i]>=t && rightgr[i]>=t){
                res.add(i);
            }
        }

        return res;

    }
}