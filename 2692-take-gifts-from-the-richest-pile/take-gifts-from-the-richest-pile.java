class Solution {
    public long pickGifts(int[] gifts, int k) {
        Queue<Integer> qu = new PriorityQueue<>((a,b)->b-a);

        for(int g: gifts){
            qu.add(g);
        }

        for(int i =0; i<k; i++){
            int max = qu.poll();
            max = (int)Math.sqrt(max);
            qu.add(max);
        }
        
        long sum =0;
        for(int i=0; i<gifts.length; i++){
            sum += qu.poll();
        }

        return sum;
    }
}