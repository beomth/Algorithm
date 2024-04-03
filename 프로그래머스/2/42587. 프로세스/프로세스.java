import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        // location은 index
        int answer = 0;
        PriorityQueue<Integer> Q = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0; i < priorities.length; i++) {
            Q.add(priorities[i]);
        }
        // 작업 시작
        while(!Q.isEmpty()) {
            // 기존 우선순위 배열 순회
            for(int i = 0; i < priorities.length; i++) {
                // 현재 작업의 위치 찾기
                if(Q.peek() == priorities[i]) {
                    Q.poll();
                    answer++;
                    // 현재 작업이 location과 같으면 answer 반환
                    if(location == i){
                        return answer;
                    }
                }
            }
        }
        return answer;
    }
}