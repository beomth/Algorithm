import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> map = new HashMap<>();
        for(String key : participant) {
            // key가 없으면 1 추가, 있으면 그 값에 1 추가
            map.put(key, map.getOrDefault(key, 0) + 1);
        }
        for(String key : completion) {
            // participant에 무조건 key가 있기 때문에, 값에 - 1
            map.put(key, map.getOrDefault(key, 0) - 1);
        }
        for(String keys : map.keySet()){
            if(map.get(keys) != 0) {
                return keys;
            }
        }
        return "";
    }
}