class MyCalendar {


    TreeSet<Integer[]> st = new TreeSet<>((a,b)->a[0]-b[0]);
    public MyCalendar() {
        
    }
    
    public boolean book(int startTime, int endTime) {
        
        Integer[] newInterval = new Integer[]{startTime, endTime};
        Integer[] prevBooking = st.floor(newInterval);
        Integer[] nextBooking = st.ceiling(newInterval);
        if (prevBooking != null && startTime < prevBooking[1]) {
            return false; // Overlap detected with previous booking
        }

        if (nextBooking != null && endTime > nextBooking[0]) {
            return false; // Overlap detected with next booking
        }

        st.add(newInterval);
        return true;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(startTime,endTime);
 */