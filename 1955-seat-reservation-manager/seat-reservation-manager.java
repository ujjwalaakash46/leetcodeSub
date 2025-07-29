class SeatManager {
    // Queue<Integer> qu = new PriorityQueue<>();
    boolean[] seat;
    int s=0, c=0;
    public SeatManager(int n) {
        s=n;
        seat = new boolean[n];
    }
    
    public int reserve() {
        int re = c;
        // System.out.println(c);
        seat[c]=true;
        while(c<s){
            if(seat[c]==false)break;
            c++;
        }
        // System.out.println("new c :"+c);
        return re+1;
    }
    
    public void unreserve(int seatNumber) {
        // System.out.println("re:"+seatNumber);
        seatNumber=seatNumber-1;
        if(seatNumber<c)c=seatNumber;
        // System.out.println("re new c:"+c);
        seat[seatNumber]=false;
    }
}

/**
 * Your SeatManager object will be instantiated and called as such:
 * SeatManager obj = new SeatManager(n);
 * int param_1 = obj.reserve();
 * obj.unreserve(seatNumber);
 */