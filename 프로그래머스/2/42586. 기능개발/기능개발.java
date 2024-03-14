import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        // 0. 초기환경 셋팅
        Queue<Integer> q = new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < progresses.length; i++) {
            // 배포되는 날짜 계산
            // 100 - progresses / speeds 나머지가 0이면 몫이 배포 날짜, 아니면 몫 + 1
            if((100 - progresses[i]) % speeds[i] == 0) {
                q.offer((100 - progresses[i]) / speeds[i]);
            }
            else {
                q.offer(((100 - progresses[i]) / speeds[i]) + 1 );
            }
        }
        
        int x = q.poll();
        int count = 1;
        while(!q.isEmpty()) {
            // x > q.peek는 앞에 있는 프로세스가 더 오래 걸릴 경우
            if(x >= q.peek()){
                count++;    // 개수 증가
                q.poll();
            }
            else {
                list.add(count);
                count = 1;
                x = q.poll();
            }
        }
        list.add(count);
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}