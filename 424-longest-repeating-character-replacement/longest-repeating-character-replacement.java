class Solution {
    public int characterReplacement(String s, int k) {
        // int[] freq = new int[26];
        // int l=0, r=0, n=s.length();
        // int max=0;

        // while(r<n && l<=r){
        //     char cr = s.charAt(r);
        //     freq[cr-'A']++; 
        //     int maxfreq = maxfreqCal(freq);
        //     if(r-l+1 - maxfreq <= k){
        //         max= Math.max(max, r-l+1);
        //     }else{
        //         for(int i=l; i<r; i++){
        //             freq[s.charAt(i)-'A']--;
        //             l++;
        //             maxfreq = maxfreqCal(freq);
        //             if(r-l+1 - maxfreq <= k){
        //                 break;
        //             }
        //         }
        //     }
        //     r++;
        // }
        // return max;

        int[] freq = new int[26];
        int l = 0, r = 0, n = s.length();
        int max = 0;
        int maxFreq = 0;

        while (r < n) {
            char cr = s.charAt(r);
            freq[cr - 'A']++;
            maxFreq = Math.max(maxFreq, freq[cr - 'A']);

            if (r - l + 1 - maxFreq > k) {
                freq[s.charAt(l) - 'A']--;
                l++;
            } else {
                max = Math.max(max, r - l + 1);
            }
            r++;
        }
        return max;

    }

    public int maxfreqCal(int[] n){
        int max=0;
        for(int nn:n){
            if(nn>max)max=nn;
        }
        return max;
    }
}