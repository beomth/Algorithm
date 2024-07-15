class Solution {
    public int solution(String[][] board, int h, int w) {
        int count = 0;
        int n = board.length;
        int[] dh = {0, 1, -1, 0};
        int[] dw = {1, 0, 0, -1};
        
        for(int i = 0; i < 4; i++) {
            int h_check = dh[i] + h;
            int w_check = dw[i] + w;
            if(h_check < n && w_check < n && h_check>=0 && w_check>=0) {
                if(board[h][w].equals(board[h_check][w_check])){
                    count++;
                }
            }
        }
        return count;
    }
}