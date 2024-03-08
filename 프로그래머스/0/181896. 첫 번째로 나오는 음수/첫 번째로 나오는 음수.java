class Solution {
    public int solution(int[] num_list) {
        int answer = -2;
        int cnt = 0;
        for(int i = 0; i < num_list.length; i++) {
            if(num_list[i] < 0){
                answer = i;
                break;                
            }
        }
        if(answer == -2)    answer = -1;
        return answer;
    }
}