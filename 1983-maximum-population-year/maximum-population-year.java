class Solution {
    public int maximumPopulation(int[][] logs) {
        // TreeMap<Integer, Integer> mp = new TreeMap<>();
        int[] yearf = new int[101];

        for(int[] p : logs){
            // mp.put(p[0], mp.getOrDefault(p[0], 0)+1);
            // mp.put(p[1], mp.getOrDefault(p[1], 0)-1);

            yearf[p[0]-1950] += 1;
            yearf[p[1]-1950] -= 1;
        }

        int mx = 0;
        int mx_c = 0;
        int mxyear = 0;
        // for(Map.Entry<Integer, Integer> en: mp.entrySet()){
        //     mx_c+=en.getValue();
        //     if(mx_c>mx){
        //         mx=mx_c;
        //         mxyear=en.getKey();
        //     }
        // }

        for(int i =0;i<yearf.length; i++){
            
            mx_c +=yearf[i];
            if(mx_c>mx){
                mx=mx_c;
                mxyear = 1950+i;
                System.out.println(mxyear);
            }
        }

        return mxyear;
    }
}