import java.util.*;

class Solution {
    public int solution(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();
        int answer = 0;
        for(int i = 0; i < nums.length; i++) {
            hashSet.add(nums[i]);
        }
        if(hashSet.size() >= nums.length / 2)   answer = nums.length / 2;
        else    answer = hashSet.size();
        return answer;
    }
}