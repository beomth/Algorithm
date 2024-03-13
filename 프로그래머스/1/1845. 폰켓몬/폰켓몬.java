import java.util.*;

class Solution {
    public int solution(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int k = nums.length / 2;
        for(int x : nums) {
            set.add(x);
        }
        if(set.size() >= k) return k;
        else    return set.size();
    }
}