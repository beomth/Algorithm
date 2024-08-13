import java.util.*;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        
        Arrays.sort(citations);
        for(int i = 0; i < citations.length; i++) {
            int h = citations.length - i;
            
            if(h <= citations[i]) {
                answer = h;
                break;
            }
        }
        
        
        // int MAX_H = Integer.MIN_VALUE;
        
        // for(int i = 0; i < citations.length; i++) {
        //     int H = citations[i];
        //     if(H >= i && H <= citations.length - i) {
        //         MAX_H = H;
        //     }
        // }
        return answer;
    }
}