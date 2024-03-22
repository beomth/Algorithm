import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < commands.length; i++) {
            for(int j = commands[i][0] - 1; j <= commands[i][1] - 1; j++) {
                list.add(array[j]);
            }
            Collections.sort(list); // 자른 후 정렬까지 완료
            System.out.print(list);
            // answer에 commans[i][2] - 1 번째 수 입력
            answer[i] = list.get(commands[i][2]-1);
            list.clear();
        }
        
        return answer;
    }
}