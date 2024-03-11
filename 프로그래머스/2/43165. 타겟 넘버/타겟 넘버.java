class Solution {
    int count = 0;
    public void DFS(int L, int sum, int[] numbers, int target) {
        // 종료조건
        if(L == numbers.length) {
            //
            if(sum == target){
                count++;    
            }
            return;
        }
        else{
            DFS(L+1, sum + numbers[L], numbers, target);
            DFS(L+1, sum - numbers[L], numbers, target);
        }
    }
    public int solution(int[] numbers, int target) {
        int answer = 0;
        DFS(0, 0, numbers, target);
        answer = count;
        return answer;
    }
}