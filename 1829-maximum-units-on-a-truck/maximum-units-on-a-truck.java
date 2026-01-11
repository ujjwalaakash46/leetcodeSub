class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (int[] a, int[]b)->{
            return -a[1]+b[1];
        });
        int units =0;
        for(int[] boxType: boxTypes){
            
            int no = boxType[0];
            int unit = boxType[1];
            if(no>=truckSize){
                units+=truckSize*unit;
                break;
            }else{
                units+= (no)*unit;
                truckSize-=no;
            }
        }

        return units;
    }
}