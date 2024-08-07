import java.util.*;

class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        
        Stack<Character> stack = new Stack<>();
        
        for(Character ch : s.toCharArray()) {
            if(ch == '(') {
                stack.push(ch);
                continue;
            }
            if(ch == ')') {
                if(stack.size() == 0) {
                    return false;
                }
                if(stack.peek() == '(') {
                    stack.pop();
                }
            }
        }
        
        while(!stack.isEmpty()){
            return false;
        }
            return true;
    }
}