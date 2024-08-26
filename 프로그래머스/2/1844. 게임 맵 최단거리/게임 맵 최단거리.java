import java.util.*;

class Solution {
    static int min;
    static int visited[][];
    static int[] dx = {-1,0,0,1};
    static int[] dy = {0,1,-1,0};
    public int solution(int[][] maps){
        int answer = 0;
        int n = maps.length;
        int m = maps[0].length;
        
        visited = new int[n][m];
        
        bfs(maps, visited);
        answer = visited[n-1][m-1];
        
        if(answer == 0)  return -1;
        else    return answer;
    }

    private void bfs(int[][] maps, int[][] visited) {
        int x = 0;
        int y = 0;
        visited[y][x] = 1;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{y, x});
        
        while(!queue.isEmpty()) {
            int[] current = queue.poll();
            int cX = current[1];
            int cY = current[0];
            
            for(int i = 0; i < 4; i++) {
                int nX = cX + dx[i];
                int nY = cY + dy[i];
                
                if(nX < 0 || nX > maps[0].length-1 || nY < 0 || nY > maps.length-1) {
                    continue;
                }
                if(visited[nY][nX] == 0 && maps[nY][nX] == 1) {
                    visited[nY][nX] = visited[cY][cX] + 1;
                    queue.add(new int[]{nY, nX});
                }
            }
        }
    }
}