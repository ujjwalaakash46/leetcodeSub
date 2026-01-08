class Solution {
    public double calculateTax(int[][] b, int income) {
        double tax = 0d;
        int low = 0;
        for(int i=0; i<b.length; i++){
            // int upper = int[i]
            if(income <=low) break;

            tax += (double)(b[i][1] * (Math.min(income, b[i][0]) -low)) / 100;

            low=b[i][0];
        }

        return tax;
    }
}