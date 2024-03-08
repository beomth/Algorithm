import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            // key가 없으면
            if(!map.containsKey(s.charAt(i))){
                answer[i] = -1;
                map.put(s.charAt(i), i);
            }
            // key 있으면
            else {
                int before_idx = map.get(s.charAt(i));
                answer[i] = i - before_idx;
                map.put(s.charAt(i), i);
            }
        }
        return answer;
    }
}