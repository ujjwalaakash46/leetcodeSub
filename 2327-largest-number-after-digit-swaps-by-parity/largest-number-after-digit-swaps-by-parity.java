class Solution {
    public int largestInteger(int num) {
        String og = String.valueOf(num);
        int ogn = num; 
        Queue<Integer> quo = new PriorityQueue<>();
        Queue<Integer> que = new PriorityQueue<>();
        StringBuilder ans = new StringBuilder();


        while(ogn>9){
            if(ogn%2==0){
                que.add(ogn%10);
            }else{
                quo.add(ogn%10);
            }
            ogn=ogn/10;
        }

        if(ogn%2==0){
                que.add(ogn%10);
            }else{
                quo.add(ogn%10);
            }

        while(num>9){
            if(num%2==0){
                ans.insert(0, que.poll());
            }else{
                ans.insert(0, quo.poll());
            }
            num=num/10;
        }

        if(num%2==0){
                ans.insert(0, que.poll());
            }else{
                ans.insert(0, quo.poll());
            }
        
        return Integer.parseInt(ans.toString());

        

    }
}