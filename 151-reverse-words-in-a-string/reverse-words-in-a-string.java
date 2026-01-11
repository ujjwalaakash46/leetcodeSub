class Solution {
    public String reverseWords(String s) {
        String[] stringArray = s.trim().split("\\s+");
        StringBuilder res = new StringBuilder();
        System.out.println(Arrays.asList(stringArray));
        for(int i=stringArray.length-1; i>0; i--){
            res.append(stringArray[i]+" ");
        }
        res.append(stringArray[0]);

        return res.toString();
    }
}