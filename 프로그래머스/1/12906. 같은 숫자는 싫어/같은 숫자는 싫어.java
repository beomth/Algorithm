import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Queue<Integer> q = new LinkedList<>();
        List<Integer> list = new LinkedList<>();
        q.add(arr[0]);
        int index = 0;
        
        for(int i = 1; i < arr.length; i++) {
            //while없이
            if(q.peek() == arr[i])  continue;   
            else {
                list.add(q.poll());
                q.add(arr[i]);
            }
        }
        
        while(!q.isEmpty()) {
            list.add(q.poll());
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}