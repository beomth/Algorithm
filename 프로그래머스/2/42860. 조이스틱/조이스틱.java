import java.util.*;

class Solution {
    public int solution(String name) {
        int answer = 0;
        // 비교 시작
        int move = name.length() - 1;
        
        for(int i = 0; i < name.length(); i++) {
            // 조이스틱의 상하 결정
            answer += Math.min(name.charAt(i) - 'A', 26 - (name.charAt(i) - 'A'));
            // 다음 문자가 A인 경우 좌우 결정
            if(i < name.length() - 1 && name.charAt(i+1) == 'A') {
                int endA = i + 1;
                // A의 끝이 어딘지 확인
                while(endA < name.length() && name.charAt(endA) == 'A') {
                    endA++;
                }
                move = Math.min(move, i * 2 + (name.length() - endA));  // 오른쪽 갔다가 왼쪽
                move = Math.min(move, i + (name.length() - endA) * 2);  // 왼쪽 갔다가 오른쪽
            }
        }
        return answer + move;
    }
}