import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int n = answers.length;
        int[] st_1 = new int[n];
        int[] st_2 = new int[n];
        int[] st_3 = new int[n];
        int score_1 = 0, score_2 = 0, score_3 = 0;
        
        for(int i = 0; i < n; i++) {
            //st_1
            st_1[i] = (i % 5) + 1;
            //st_2 
            if(i % 2 == 0) st_2[i] = 2; // 짝수인 경우
            else if(i % 8 == 1) st_2[i] = 1;
            else if(i % 8 == 3) st_2[i] = 3;
            else if(i % 8 == 5) st_2[i] = 4;
            else    st_2[i] = 5;
            //st_3
            if(i % 10 == 0  || i % 10 == 1) st_3[i] = 3;
            else if(i % 10 == 2 || i % 10 == 3) st_3[i] = 1;
            else if(i % 10 == 4 || i % 10 == 5) st_3[i] = 2;
            else if(i % 10 == 6 || i % 10 == 7) st_3[i] = 4;
            else if(i % 10 == 8 || i % 10 == 9) st_3[i] = 5;
        
            if(answers[i] == st_1[i])   score_1++;
            if(answers[i] == st_2[i])   score_2++;
            if(answers[i] == st_3[i])   score_3++;
        }
        
        List<Integer> answer = new ArrayList<>();
        if(score_1 == score_2 && score_2 == score_3) {
            answer.add(1);
            answer.add(2);
            answer.add(3);
        }
        else if(score_1 == score_2 && score_2 > score_3) {
            answer.add(1);
            answer.add(2);
        }
        else if(score_1 == score_3 && score_3 > score_2) {
            answer.add(1);
            answer.add(3);
        }
        else if(score_3 == score_2 && score_2 > score_1) {
            answer.add(2);
            answer.add(3);
        }
        else if(score_1 > score_2 && score_1 > score_3) {
            answer.add(1);
        }
        else if(score_2 > score_1 && score_2 > score_3) {
            answer.add(2);
        }
        else if(score_3 > score_1 && score_3 > score_2) {
            answer.add(3);
        }
        
        Collections.sort(answer);
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}