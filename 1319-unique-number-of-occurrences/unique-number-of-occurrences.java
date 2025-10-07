class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        // Step 1: Find the min and max value in the array
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num < min) min = num;
            if (num > max) max = num;
        }

        // Step 2: Count the occurrences for each value using a frequency array
        int range = max - min + 1;
        int[] freq = new int[range];
        for (int num : arr) {
            freq[num - min]++;
        }

        // Step 3: Use a boolean array to track which occurrence counts have been seen
        boolean[] seen = new boolean[arr.length + 1]; // +1 because occurrence can be up to arr.length
        for (int count : freq) {
            if (count > 0) {
                if (seen[count]) {
                    // If this occurrence count already exists, return false
                    return false;
                }
                seen[count] = true;
            }
        }
        return true;
    }
}