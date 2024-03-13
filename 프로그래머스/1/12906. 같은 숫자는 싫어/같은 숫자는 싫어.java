import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> list = new ArrayList<>();
        Queue<Integer> Q = new LinkedList<>();
        for(int i = 0; i < arr.length; i++)
        {
            if(Q.isEmpty()){
                Q.offer(arr[i]);
            }
            else {
                if(Q.peek() != arr[i]){
                    list.add(Q.poll());
                    Q.offer(arr[i]);
                }
            }
        }
        if(!Q.isEmpty()) {
            list.add(Q.poll());
        }
        
        int[] answer = new int[list.size()];
        int i = 0;
        for(int x : list){
            answer[i] = x;
            i++;
        }
        System.out.print(list.size());
        return answer;
    }
}