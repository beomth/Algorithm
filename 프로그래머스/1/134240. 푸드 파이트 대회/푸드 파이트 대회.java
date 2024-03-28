import java.util.*;

class Solution {
    public String solution(int[] food) {
        int sum = 1;
        for(int i = 1; i < food.length; i++) {
            if(food[i] % 2 != 0){
                food[i] = food[i] - 1;
            }
            sum += food[i];
        }
        String[] str = new String[sum];
        str[sum/2] = "0";
        int lt = 0, rt = str.length - 1;
        
        for(int i = 0; i < food.length; i++) {
            int cnt = 0;
            while(cnt < (food[i] / 2)) {
                str[lt] = (i)+"";
                str[rt] = (i)+"";
                lt++;
                rt--;
                cnt++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(String x : str) {
            sb.append(x);
        }
        return sb.toString();
    }
}