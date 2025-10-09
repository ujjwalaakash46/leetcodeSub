class Solution {
    public int maximumPopulation(int[][] logs) {
        TreeMap<Integer, Integer> mp = new TreeMap<>();

        for(int[] p : logs){
            mp.put(p[0], mp.getOrDefault(p[0], 0)+1);
            mp.put(p[1], mp.getOrDefault(p[1], 0)-1);
        }

        int mx = Integer.MIN_VALUE;
        int mx_c = Integer.MIN_VALUE;
        int mxyear = 0;
        for(Map.Entry<Integer, Integer> en: mp.entrySet()){
            mx_c+=en.getValue();
            if(mx_c>mx){
                mx=mx_c;
                mxyear=en.getKey();
            }
        }

        return mxyear;
    }
}