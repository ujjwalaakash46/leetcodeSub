class Solution {
    public boolean squareIsWhite(String coordinates) {
        char col = coordinates.charAt(0);
        int row = (int) coordinates.charAt(1);

        boolean startsBlack=false;
        if(col=='a' || col=='c' || col=='e' || col=='g' ){
            startsBlack = true;
        }

        return (!startsBlack && row%2!=0) || (startsBlack && row%2==0) ;
    }
}