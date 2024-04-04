import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        Queue<Integer> Q = new LinkedList<>();
        int sum = 0;    // 다리 위의 무게
        int time = 0;   // 시간
        
        for(int i = 0; i < truck_weights.length; i++) {
            int truck = truck_weights[i];
            while(true) {
                // 큐에 아무것도 없는 경우 = 어떠한 트럭도 다리 위에 없음
                if(Q.isEmpty()) {
                    Q.add(truck);
                    sum += truck;
                    time++; // 트럭 올리는데 시간 1초 추가
                    break;
                }
                // 큐가 가득찬 경우
                else if(Q.size() == bridge_length) {
                    sum -= Q.poll();                    
                }
                // 큐가 가득차지 않은 경우
                else {
                    // 더 올릴 수 있는 경우
                    if(sum + truck <= weight) {
                        Q.add(truck);
                        sum += truck;
                        time++;
                        break;
                    }
                    // 못올리는 경우
                    else {
                        Q.add(0);
                        time++;
                    }
                }
            }
            
        }
        return time + bridge_length;
    }
}