import java.util.*;

class Solution {
    public String solution(String code) {
        String ret = "";
        int mode = 0;
        
        for(int i = 0; i < code.length(); i++) {
            // mode = 0 이고, charAt(i)가 1일 때 -> mode change
            if(code.charAt(i) == '1' && mode == 0) {
                mode = 1;
                continue;
            }
            else if(code.charAt(i) == '1' && mode == 1) {
                mode = 0;
                continue;
            }
            // mode가 0, idx가 짝수
            if(i % 2 == 0 && mode == 0) {
                ret = ret + code.charAt(i);
            }
            // mode가 1, idx가 홀수
            else if(i % 2 != 0 && mode == 1) {
                ret = ret + code.charAt(i);
            }
        }
        if(ret.length() == 0)   return "EMPTY";
        return ret;
    }
}