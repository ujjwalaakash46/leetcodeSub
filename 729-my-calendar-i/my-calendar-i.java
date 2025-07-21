class MyCalendar {


    TreeSet<Integer[]> st = new TreeSet<>((a,b)->a[0]-b[0]);
    public MyCalendar() {
        
    }
    
    public boolean book(int startTime, int endTime) {
        
        for (Integer[] existingBooking : st) {
            int existingStartTime = existingBooking[0];
            int existingEndTime = existingBooking[1];
            if (startTime < existingEndTime && endTime > existingStartTime) {
                return false; // Overlap detected, cannot book
            }
        }
        st.add(new Integer[]{startTime, endTime});
        return true;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(startTime,endTime);
 */