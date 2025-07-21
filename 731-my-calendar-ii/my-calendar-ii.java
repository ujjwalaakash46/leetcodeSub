class MyCalendarTwo {

    TreeMap<Integer, Integer> mp = new TreeMap<>();

    public MyCalendarTwo() {
        
    }
    
    public boolean book(int startTime, int endTime) {
        mp.put(startTime, mp.getOrDefault(startTime, 0)+1);
        mp.put(endTime, mp.getOrDefault(endTime, 0)-1);
        int sum = 0;
        boolean f = false;
        for( Integer k : mp.keySet()){
            sum +=mp.get(k);
            if(sum>2){
                f=true;
                break;
            } 
        }

        if(f){
            mp.put(startTime, mp.getOrDefault(startTime, 0)-1);
            mp.put(endTime, mp.getOrDefault(endTime, 0)+1);
            return false;
        }
        return true;
    }
}

/**
 * Your MyCalendarTwo object will be instantiated and called as such:
 * MyCalendarTwo obj = new MyCalendarTwo();
 * boolean param_1 = obj.book(startTime,endTime);
 */