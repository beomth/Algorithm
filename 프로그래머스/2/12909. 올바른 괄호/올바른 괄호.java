import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Stack<Character> st = new Stack<>();
        char[] arr = s.toCharArray();
        for(char c : arr) {
            if(c == '(')   st.push('(');
            else{
                if(st.isEmpty())    return false;
                else    st.pop();
            }
        }
        if(st.isEmpty())    return answer;
        else    return false;
    }
}