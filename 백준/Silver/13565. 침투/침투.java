import java.util.*;
import java.io.*;

public class Main {
	final static int MAX = 1000 + 10;
	static boolean[][] map;
	static boolean[][] visited;
	static int N, M;
	static boolean answer;
	static int[] DirY = {1, -1, 0, 0};
	static int[] DirX = {0, 0, 1, -1};
	
	public static void dfs(int y, int x) {
		
		if(y == N) {
			answer = true;
			return;
		}
		visited[y][x] = true;
		
		for(int i = 0; i < 4; i++) {
			int newY = y + DirY[i];
			int newX = x + DirX[i];
			
			if(map[newY][newX] && visited[newY][newX] == false)
				dfs(newY,newX);
		}
		
	}
	public static void main(String[] args) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st= new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		map = new boolean[MAX][MAX];
		visited = new boolean[MAX][MAX];
		
		// map에 값을 입력
		for(int i = 1; i <= N; i++) {
			String str = br.readLine();
			for(int j = 1; j <= M; j++) {
				// 만약 0(전류가 통하는)이라면 true, 아니면 false
				map[i][j] = (str.charAt(j-1) == '0') ? true : false;
			}
		}
		
		for (int i = 1; i <= M; i++) {
			if(map[1][i]) {
				dfs(1, i);	
			}
			
		}
		
		// 출력
		if(answer) {
			bw.write("YES");
		} else {
			bw.write("NO");
		}
		
		br.close();
		bw.close();
	}
	
}
