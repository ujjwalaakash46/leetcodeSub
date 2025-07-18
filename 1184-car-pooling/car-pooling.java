class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        TreeMap<Integer, Integer> mp = new TreeMap<>();

        for(int[] d: trips){
            mp.put(d[1], mp.getOrDefault(d[1], 0) + d[0]);
            mp.put(d[2], mp.getOrDefault(d[2], 0) - d[0]);
        }
        int sum = 0;
        for(Integer i: mp.keySet()){
            sum += mp.get(i);
            if(sum>capacity){
                return false;
            }
        }

        return true;
    }
}