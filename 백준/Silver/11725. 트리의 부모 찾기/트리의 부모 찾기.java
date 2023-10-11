import java.io.*;
import java.util.*;

public class Main {

    static final int MAX = 100000 + 10;
    static ArrayList<Integer>[] graph;
    static boolean[] visited;
    static int N;
    static int[] answer;

    public static void dfs(int idx) {
        visited[idx] = true;

        for(int i = 0; i < graph[idx].size(); i++) {
            int next = graph[idx].get(i);
            if(visited[next] == false) {
                answer[next] = idx;
                dfs(next);
            }
        }
    }
    public static void main(String[] args) throws IOException {

        // 0. 입력 및 초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());

        graph = new ArrayList[MAX];
        visited = new boolean[MAX];
        answer = new int[MAX];
        for(int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        StringTokenizer st;
        for(int j = 0; j < N-1; j++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            graph[x].add(y);
            graph[y].add(x);
        }

        dfs(1);

        for(int i = 2; i <= N; i++) {
            bw.write(String.valueOf(answer[i]));
            bw.newLine();
        }

        br.close();
        bw.close();
    }
}