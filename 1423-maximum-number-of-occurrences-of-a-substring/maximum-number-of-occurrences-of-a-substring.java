class Solution {
    public int maxFreq(String s, int maxLetters, int minSize, int maxSize) {
        int n = s.length();
        int[] freq = new int[26];
        int distinct = 0;
        HashMap<String, Integer> countMap = new HashMap<>();
        
        // Initialize first window
        for (int i = 0; i < minSize; i++) {
            char c = s.charAt(i);
            if (freq[c - 'a']++ == 0) distinct++;
        }
        
        if (distinct <= maxLetters) {
            countMap.put(s.substring(0, minSize), 1);
        }
        
        // Slide window
        for (int i = 1; i <= n - minSize; i++) {
            // Remove left character
            char left = s.charAt(i - 1);
            if (--freq[left - 'a'] == 0) distinct--;
            
            // Add right character
            char right = s.charAt(i + minSize - 1);
            if (freq[right - 'a']++ == 0) distinct++;
            
            // Update count if valid
            if (distinct <= maxLetters) {
                String substr = s.substring(i, i + minSize);
                countMap.put(substr, countMap.getOrDefault(substr, 0) + 1);
            }
        }
        
        return countMap.values().stream().max(Integer::compare).orElse(0);
    }
}