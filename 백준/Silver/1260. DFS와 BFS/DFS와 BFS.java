import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int N, M, V;
    static boolean[] visited;
    static boolean[][] graph;
    static StringBuilder sb = new StringBuilder();
    static Queue<Integer> q = new LinkedList<>();

    public static void bfs(int start) {
        q.add(start);
        visited[start] = true;

        while (!q.isEmpty()) {

            start = q.poll();
            sb.append(start).append(" ");

            for (int i = 1; i <= N; i++) {
                if (graph[start][i] && !visited[i]) {
                        q.add(i);
                        visited[i] = true;
                }
            }
        }
    }

    public static void dfs(int start) {
        visited[start] = true;
        sb.append(start).append(" ");

        for (int i = 1; i <= N; i++) {
            if(graph[start][i] && !visited[i]) {
                dfs(i);
            }
        }

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 1. 입력 먼저

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());

        visited = new boolean[N + 10];
        graph = new boolean[N + 10][N + 10];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());

            int y = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());

            graph[y][x] = true;
            graph[x][y] = true;
        }

        dfs(V);
        System.out.println(sb.toString());
        sb = new StringBuilder();
        visited = new boolean[N + 10];
        bfs(V);
        System.out.println(sb.toString());
    }
}
