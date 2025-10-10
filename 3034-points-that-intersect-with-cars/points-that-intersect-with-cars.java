class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {
        int tn=0;
        int curr = 0;

        int[] numl = new int[102];

        for(List<Integer> n : nums){
            numl[n.get(0)] += 1;
            numl[n.get(1)+1] -= 1;
        }

        for(int i=0; i<numl.length; i++){
            curr+=numl[i];
            if(curr>0) tn++;
        }

        return tn;
    }
}