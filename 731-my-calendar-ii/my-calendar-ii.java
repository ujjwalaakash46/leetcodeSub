class MyCalendarTwo {

    TreeMap<Integer, Integer> mp = new TreeMap<>();

    public MyCalendarTwo() {
        
    }
    
    public boolean book(int startTime, int endTime) {
        mp.put(startTime, mp.getOrDefault(startTime, 0)+1);
        mp.put(endTime, mp.getOrDefault(endTime, 0)-1);
        int sum = 0;
        for( Integer k : mp.keySet()){
            sum +=mp.get(k);
            if(sum>2){
                mp.put(startTime, mp.get(startTime) - 1);
                // If the value becomes 0, remove the key to keep the map clean
                if (mp.get(startTime) == 0) {
                    mp.remove(startTime);
                }

                mp.put(endTime, mp.get(endTime) + 1);
                // If the value becomes 0, remove the key
                if (mp.get(endTime) == 0) {
                    mp.remove(endTime);
                }
                return false;
            } 
        }
        return true;
    }
}

/**
 * Your MyCalendarTwo object will be instantiated and called as such:
 * MyCalendarTwo obj = new MyCalendarTwo();
 * boolean param_1 = obj.book(startTime,endTime);
 */