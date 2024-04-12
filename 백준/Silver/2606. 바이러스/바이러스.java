import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int N, M, answer;

    static boolean[][] graph;
    static boolean[] visited;

    public static void dfs(int idx){
        visited[idx] = true;
        answer++;

        for(int i = 1; i <= N; i++){
            if(visited[i] == false && graph[idx][i] == true){
                dfs(i);
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());
        graph = new boolean[N+1][N+1];
        visited = new boolean[N+1];

        for(int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            graph[r][c] = true;
            graph[c][r] = true;
        }

        dfs(1);

        bw.write(String.valueOf(answer - 1));
        br.close();
        bw.close();
    }
}
