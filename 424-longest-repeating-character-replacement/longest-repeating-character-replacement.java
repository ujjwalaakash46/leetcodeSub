class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int l=0, r=0, n=s.length();
        int max=0;

        while(r<n && l<=r){
            // System.out.println(r);
            char cr = s.charAt(r);
            freq[cr-'A']++; 
            int maxfreq = maxfreqCal(freq);
            // System.out.println(maxfreq);
            if(r-l+1 - maxfreq <= k){
                // System.out.println(2);
                max= Math.max(max, r-l+1);
            }else{
                // System.out.println(3);
                for(int i=l; i<r; i++){
                    freq[s.charAt(i)-'A']--;
                    l++;
                    maxfreq = maxfreqCal(freq);
                    if(r-l+1 - maxfreq <= k){
                        break;
                    }
                }
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