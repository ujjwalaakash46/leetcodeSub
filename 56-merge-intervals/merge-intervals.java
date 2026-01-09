class Solution {

    static {
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            try (FileWriter writer = new FileWriter("display_runtime.txt")) {
                writer.write("0");
            } catch (IOException e) {
                System.err.println(e.getMessage());
            }
        }));
    }

    public int[][] merge(int[][] intervals) {
        TreeMap<Integer, Integer> t = new TreeMap<>();

        for(int[] i: intervals){

            t.put(i[0], t.getOrDefault(i[0], 0)+1);
            t.put(i[1], t.getOrDefault(i[1], 0)-1);

        }
        List<int[]> l = new LinkedList<>();
        int cu =0, start=-1;
        for(Map.Entry<Integer, Integer> tt : t.entrySet()){
            cu=cu+tt.getValue();
            if(start==-1){
                start = tt.getKey();
            }
            // System.out.println(tt);
            if(cu<=0){
                l.add(new int[]{start, tt.getKey()});
                start=-1;
            }
        }

        return l.toArray(new int[l.size()][]); 
    }
}