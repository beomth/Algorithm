import java.util.*;
import java.io.*;

class Main {

	final static int MAX = 50 + 10;
	static boolean[][] map;
	static boolean[][] visited;
	static int W, H;
	static int[] DirY = {-1, -1, -1, 0, 0, 1, 1, 1};
	static int[] DirX = {-1, 0, 1, -1, 1, -1, 0, 1};
	
	public static void dfs(int y, int x) {
		visited[y][x] = true;
		
		for(int i = 0; i < 8; i++) {
			int newY = y + DirY[i];
			int newX = x + DirX[i];
			if(map[newY][newX] && visited[newY][newX] == false) {
				dfs(newY, newX);
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
			
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		// 0. 입출력 
		while(true) {
		
			StringTokenizer st;
			st = new StringTokenizer(br.readLine());
			
			W = Integer.parseInt(st.nextToken());
			H = Integer.parseInt(st.nextToken());
			
			// 마지막 입력 값이 0이면 while 문 빠져나오기
			if(W == 0 && H == 0)
				break;

			map = new boolean[MAX][MAX];
			visited = new boolean[MAX][MAX];
			for(int i = 1; i <= H; i++) {
				st = new StringTokenizer(br.readLine());
				for(int j = 1; j <= W; j++) {
					map[i][j] = (Integer.parseInt(st.nextToken()) == 1) ? true : false;
				}
			}
			
			int answer = 0;
			for(int i = 1; i <=H; i++) {
				for(int j = 1; j <=W; j++) {
					if(map[i][j] && visited[i][j] == false) {
						dfs(i, j);
						answer++;
					}
				}
			}
			
			bw.write(String.valueOf(answer));
			bw.newLine();
		}
		
		bw.close();
		br.close();
	}
}
