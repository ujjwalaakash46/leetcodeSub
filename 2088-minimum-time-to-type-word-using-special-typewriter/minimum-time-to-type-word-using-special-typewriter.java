class Solution {
    public int minTimeToType(String word) {
        int res = 0;
        char prev = 'a';

        for( char c: word.toCharArray()){
            // int clo = Math.abs(prev - c);
            // if(clo>13) clo = ('a' - prev) + ('z' - c);
            // res = res + clo + 1 ;
            res = res + clockwise(prev, c) + 1 ;
            prev = c; 
        }

        return res;
    }

    public int clockwise(char s, char e){

        if(s>e){
            return s-e>13?('z'-s + e-'a' +1 ): s-e;
        }else{
            //e>s
            return e-s>13?('z'-e + s-'a' +1 ): e-s;
            // return clockwise(s, e);
        }

        // return s>e? ('z'-s + e-'a' +1 ): e - s;
    }

    public int anticlockwise(char s, char e){
        return s>e? 'z'-s + e-'a' +1 : s - e;
    }
}