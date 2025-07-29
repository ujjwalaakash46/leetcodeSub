class SeatManager {


    Queue<Integer> qu = new PriorityQueue<>();
    int s=0;
    public SeatManager(int n) {
        s=n;
        while(n>0){
            qu.add(n--);
        }
    }
    
    public int reserve() {
        return qu.poll();
    }
    
    public void unreserve(int seatNumber) {
        qu.add(seatNumber);
    }
}

/**
 * Your SeatManager object will be instantiated and called as such:
 * SeatManager obj = new SeatManager(n);
 * int param_1 = obj.reserve();
 * obj.unreserve(seatNumber);
 */