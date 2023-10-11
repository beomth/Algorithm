import java.io.*;
import java.util.*;

public class Main {

    static final int MAX = 10000 + 10;
    static boolean[][] graph;
    static ArrayList<Integer> queue;
    static boolean[] visited;
    static int N, M, V;

    public static void dfs(int idx) {
        visited[idx] = true;
        System.out.print(idx + " ");
        for (int i = 1; i <= N; i++) {
            if (visited[i] == false && graph[idx][i] == true) {
                dfs(i);
            }
        }
    }

    public static void bfs() {
        queue = new ArrayList<>();
        visited = new boolean[MAX];

        queue.add(V);
        visited[V] = true;

        while (!queue.isEmpty()) {
            int idx = queue.remove(0);
            System.out.print(idx + " ");

            for (int i = 1; i <= N; i++) {
                if (visited[i] == false && graph[idx][i] == true) {
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {

        // 0. 입력 및 초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());

        graph = new boolean[MAX][MAX];
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            graph[x][y] = true;
            graph[y][x] = true;
        }
        visited = new boolean[MAX];

        dfs(V);
        System.out.println();
        bfs();

        br.close();
        bw.close();
    }
}