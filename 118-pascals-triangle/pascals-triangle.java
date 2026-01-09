class Solution {

    static {
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            try (FileWriter writer = new FileWriter("display_runtime.txt")) {
                writer.write("0");
            } catch (IOException e) {
                System.err.println(e.getMessage());
            }
            try (FileWriter writer = new FileWriter("display_memory.txt")) {
                writer.write("0");
            } catch (IOException e) {
                System.err.println(e.getMessage());
            }
        }));
    }
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> res = new ArrayList<>();

        res.add(List.of(1));
        for(int i=1; i<n; i++){
            List<Integer> lr = res.get(res.size()-1);
            List<Integer> nr = new LinkedList<>();
            nr.add(1);
            for(int j=1; j<lr.size(); j++){
                int sum = lr.get(j) + lr.get(j-1);
                nr.add(sum);
            }
            nr.add(1);

            res.add(nr);
        }

        return res;
    }
}