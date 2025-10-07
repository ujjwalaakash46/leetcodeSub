class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        for( int a : arr){
            mp.put(a, mp.getOrDefault(a, 0)+1);
        }
        
        Set<Integer> set = new HashSet<>();
        for(Map.Entry<Integer, Integer> es: mp.entrySet()){
            if(set.contains(es.getValue())){
                return false;
            }
            set.add(es.getValue());
        }

        return true;
    }
}