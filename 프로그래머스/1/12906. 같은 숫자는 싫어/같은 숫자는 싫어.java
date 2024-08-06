import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int index = 0;
        
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        stack.push(arr[index]);
        index++;

        for(int i = 0; i < arr.length; i++) {
            if(stack.isEmpty()) {
                stack.push(arr[i]);
            }
            else {
                if(stack.peek() == arr[i]) {
                    continue;
                }
                else {
                    list.add(stack.pop());
                    stack.push(arr[i]);
                }
            }
        }
        
        if(!stack.isEmpty()){
            list.add(stack.pop());
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}