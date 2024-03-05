class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        int count = 0;
        int[] dh = {0, 1, -1, 0};
        int[] dw = {1, 0, 0, -1};
        int n = board.length;        
        for(int i = 0; i < 4; i++) {
            //오, 위, 아, 왼
            int h_check = h + dh[i];
            int w_check = w + dw[i];
            if(h_check < n && w_check < n && h_check>=0 && w_check >=0) {
                if(board[h][w].equals(board[h_check][w_check])) {
                    answer++;
                }    
            }
        }
        return answer;
    }
}