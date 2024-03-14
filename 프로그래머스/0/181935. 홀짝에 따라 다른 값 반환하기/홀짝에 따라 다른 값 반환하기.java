class Solution {
    public int solution(int n) {
        int answer = 0;
        int even = 0, odd = 0;
        for(int i = 1; i <= n; i++) {
            if(i % 2 == 0) {
                even += i * i;
            }
            else {
                odd += i;
            }
        }
        if(n % 2 == 0)  return even;
        else    return odd;
    }
}