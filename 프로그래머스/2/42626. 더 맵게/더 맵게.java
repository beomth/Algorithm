import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int x : scoville) {
            pq.offer(x);
        }
        
        while(!pq.isEmpty()) {
            int sum = 0;
            
            // 마지막에 1개 남고, 스코빌지수를 넘지 못할 때
            if(pq.size() == 1 && pq.peek() < K) {
                return -1;
            }
            // 가장 작은 수가 스코빌지수를 
            if(pq.peek() >= K)  return answer;
            // 스코빌 지수 아래에 있는 원소가 있을 때
            if(pq.peek() < K) {
                sum = pq.poll() + pq.poll() * 2;
                pq.offer(sum);
                answer++;
            }
        }        

        return answer;
    }
}