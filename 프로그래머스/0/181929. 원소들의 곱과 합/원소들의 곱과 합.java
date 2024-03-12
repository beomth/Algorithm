class Solution {
    public int solution(int[] num_list) {
        int dot = 1, sum = 0;
        for(int i = 0; i < num_list.length; i++) {
            dot *= num_list[i];
            sum += num_list[i];
        }
        if(dot < sum*sum)   return 1;
        else    return 0;
    }
}