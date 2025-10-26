class Solution {
    public int maxNumberOfFamilies(int n, int[][] rs) {
        int c=0;
        HashMap<Integer, List<Integer>> mp = new HashMap<>();
        for(int[] row : rs){
            List<Integer> li =  mp.getOrDefault(row[0], new ArrayList());
            li.add(row[1]);
            mp.put(row[0], li);
        }

        for(Map.Entry<Integer, List<Integer>> es: mp.entrySet()){
            List<Integer> li = es.getValue();
            int ogc = c;
            boolean ls = true;
            boolean rss = true;
            boolean cs = true;
            for(Integer s : li){
                if(2<=s && s<=5){
                    ls=false;
                }
                if(6<=s && s<=9){
                    rss=false;
                }

                if(4<=s && s<=7){
                    cs=false;
                }
            }

            if(ls) c++;
            if(rss) c++;
            if(cs && c==ogc) c++;

        }

        return c + (n - mp.size())*2; 
    }
}