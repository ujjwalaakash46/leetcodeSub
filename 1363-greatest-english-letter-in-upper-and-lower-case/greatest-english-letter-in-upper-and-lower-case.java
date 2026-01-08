class Solution {
    public String greatestLetter(String s) {
        char gre= 'A'-1;

        Set<Character> lo = new HashSet<>(); 

        for(char c : s.toCharArray()){

            lo.add(c);

                char upper = Character.toUpperCase(c);
            if(lo.contains(upper) && lo.contains(Character.toLowerCase(c))){
                // char upper = Character.toUpperCase(c);
                gre = gre<upper?upper:gre;
            }
        }

        return gre == 'A'-1?"":String.valueOf(gre);
    }
}