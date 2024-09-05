import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        StringBuilder sb = new StringBuilder();
        Map<Character, Integer> map = new HashMap<>();
        
        map.put('R', 0);
        map.put('T', 0);
        map.put('C', 0);
        map.put('F', 0);
        map.put('J', 0);
        map.put('M', 0);
        map.put('A', 0);
        map.put('N', 0);
        
        
        for(int i = 0; i < choices.length; i++) {
            if(choices[i] < 4 && choices[i] == 1) {
                map.put(survey[i].charAt(0), map.getOrDefault(survey[i].charAt(0), 0) + 3);
            }
            if(choices[i] < 4 && choices[i] == 2) {
                map.put(survey[i].charAt(0), map.getOrDefault(survey[i].charAt(0), 0) + 2);
            }
            if(choices[i] < 4 && choices[i] == 3) {
                map.put(survey[i].charAt(0), map.getOrDefault(survey[i].charAt(0), 0) + 1);
            }
            if(choices[i] > 4 && choices[i] == 5){
                map.put(survey[i].charAt(1), map.getOrDefault(survey[i].charAt(1), 0) + 1);
            }
            if(choices[i] > 4 && choices[i] == 6){
                map.put(survey[i].charAt(1), map.getOrDefault(survey[i].charAt(1), 0) + 2);
            }
            if(choices[i] > 4 && choices[i] == 7){
                map.put(survey[i].charAt(1), map.getOrDefault(survey[i].charAt(1), 0) + 3);
            }
            
            else    continue;
        }

        sb.append(map.get('R') >= map.get('T') ? 'R' : 'T');
        sb.append(map.get('C') >= map.get('F') ? 'C' : 'F');
        sb.append(map.get('J') >= map.get('M') ? 'J' : 'M');
        sb.append(map.get('A') >= map.get('N') ? 'A' : 'N');
        
        return sb.toString();
    }
}