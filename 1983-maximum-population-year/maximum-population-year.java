class Solution {
    public int maximumPopulation(int[][] logs) {
        int year = Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;
        TreeMap<Integer, Integer> mp = new TreeMap<>();

        for(int[] p : logs){
            mp.put(p[0], mp.getOrDefault(p[0], 0)+1);
            mp.put(p[1], mp.getOrDefault(p[1], 0)-1);
        }

        int lm=0;
        for(Integer k: mp.keySet()){
            lm += mp.get(k);
            if(lm>max){
                max=lm;
                year=k;
            }
        }



        return year;
    }
}