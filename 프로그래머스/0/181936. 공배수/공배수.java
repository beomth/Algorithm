class Solution {
    public int solution(int number, int n, int m) {
        int answer = 1;
        if(number % n == 0 && number % m == 0)  return answer;
        return 0;
    }
}