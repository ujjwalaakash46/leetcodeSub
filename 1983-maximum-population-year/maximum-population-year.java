class Solution {
    public int maximumPopulation(int[][] logs) {
        // TreeMap<Integer, Integer> mp = new TreeMap<>();
        int[] yearf = new int[101];

        for(int[] p : logs){

            yearf[p[0]-1950] += 1;
            yearf[p[1]-1950] -= 1;
        }

        int mx = 0;
        int mx_c = 0;
        int mxyear = 0;

        for(int i =0;i<yearf.length; i++){
            
            mx_c +=yearf[i];
            if(mx_c>mx){
                mx=mx_c;
                mxyear = 1950+i;
            }
        }

        return mxyear;
    }
}