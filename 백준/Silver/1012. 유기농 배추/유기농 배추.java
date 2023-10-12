import java.io.*;
import java.util.*;

class Main {
	final static int MAX = 50 + 10;
    static boolean[][] map;
    static int T, M, N, K;
    static boolean[][] visited;
    
    // 상하좌우 위치 확인을 위한 Direction X, Y
    static int[] DirY = {1, -1, 0, 0};
    static int[] DirX = {0, 0, 1, -1};

    public static void dfs(int y, int x) {
    	visited[y][x] = true;
    	for(int i = 0; i < 4; i++) {
    		int newY = y + DirY[i];
    		int newX = x + DirX[i];
    		if(map[newY][newX] && visited[newY][newX] == false) {
    			dfs(newY, newX);
    		}
    	}
    	
    	
    }
    public static void main(String[] args) throws IOException{
        
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	T = Integer.parseInt(br.readLine());
    	
    	while(T > 0) {
    		
    		StringTokenizer st = new StringTokenizer(br.readLine());
    		M = Integer.parseInt(st.nextToken());
    		N = Integer.parseInt(st.nextToken());
    		K = Integer.parseInt(st.nextToken());
    		
    		map = new boolean[MAX][MAX];
    		visited = new boolean[MAX][MAX];
    		for(int i = 0; i < K; i++) {
    			st = new StringTokenizer(br.readLine());
    			int x = Integer.parseInt(st.nextToken());
    			int y = Integer.parseInt(st.nextToken());
    			
    			// index를 [1][1]부터 시작하기 위함
    			map[y+1][x+1] = true;
    		}
			int answer = 0;
    		for(int i = 1; i <= N; i++) {
    			for(int j = 1; j <= M; j++) {
    				if(map[i][j] && visited[i][j] == false) {
    					answer++;
    					dfs(i, j);
    				}
    			}
    		}
    		
    		bw.write(String.valueOf(answer));
    		bw.newLine();
    		T--;
    	}
    	
    	bw.close();
    	br.close();
        // 0. T, M, N, K 배열 입출력 및 dfs 선언
             
    }
}