import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        Arrays.sort(score);
        int answer = 0;
        int repeat = score.length / m;
        int rest = score.length % m;
        
        // m개로 안 나뉘는 경우
        if(score.length % m != 0) {
            for(int i = 0; i < repeat; i++) {
                answer += m*score[(i*m) + rest];
            }
        }
        // m개로 나뉘는 경우
        else {
            for(int i = 0; i < repeat; i++) {
                answer += m*score[i*m];
            }
        }
        return answer;
    }
}