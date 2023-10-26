import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
		HashMap<Character, Integer> hashMap = new HashMap<>();
		
		// keymap에 있는 각 원소를, 몇 번 눌러야 최소값인지를 hashMap에 저장
		for(String key : keymap) {
			for(int i = 0; i < key.length(); i++) {
				char ch = key.charAt(i);
				if(!hashMap.containsKey(ch) || hashMap.get(ch) > i) {
					hashMap.put(ch, i+1);
				}
			}
		}
		
		// 비교
		for(int i = 0; i < targets.length; i++) {
			int cnt = 0;
			for (int j  = 0; j < targets[i].length(); j++) {
				char ch = targets[i].charAt(j);
				if(!hashMap.containsKey(ch)) {
					cnt = 0;
					break;
				}
				else {
					cnt = cnt + hashMap.get(ch);
				}
			}
			
			answer[i] = cnt == 0 ? -1 : cnt;
		}
		
		return answer;
        
    }
}