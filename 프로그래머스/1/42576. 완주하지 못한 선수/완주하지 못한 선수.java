import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> map = new HashMap<>();
        for(String name : participant) {
            map.put(name, map.getOrDefault(name, 0) + 1);
        }
        for(String key : completion) {
            map.put(key, map.getOrDefault(key, 0) - 1);
        }
        for(String keys : map.keySet()) {
            if(map.get(keys) != 0) {
                return keys;
            }
        }
        return "";
    }
}