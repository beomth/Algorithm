import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        
        int time = 0, sum = 0;
        // Q 자체를 다리라고 생각
        Queue<Integer> Q = new LinkedList<>();
        
        // Q가 비어있을 때, 꽉찼을 때, 공간 있을 때 3 케이스로 풀기
        for(int i = 0; i < truck_weights.length; i++) {
            int truck = truck_weights[i];
            while(true) {
                // Q가 비었을 때
                if(Q.isEmpty()) {
                    Q.add(truck);
                    sum += truck;
                    time++;
                    break;
                }
                // Q가 꽉 찼을 때
                else if(Q.size() == bridge_length) {
                    sum -= Q.poll();
                }
                // Q 자리 있을 때
                else {
                    if(sum + truck <= weight) {
                        Q.add(truck);
                        sum += truck;
                        time++;
                        break;
                    }
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