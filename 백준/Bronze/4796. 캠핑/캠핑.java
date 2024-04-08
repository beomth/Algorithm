import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
	public static void main(String[] args) throws IOException{
		// L 사용일수 P 연속 V 휴가
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int i = 1;
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int L = Integer.parseInt(st.nextToken());
			int P = Integer.parseInt(st.nextToken());
			int V = Integer.parseInt(st.nextToken());
			if(L == 0 && P == 0 && V == 0)	break;
			int total = L * (V/P) + Math.min(L, V%P);
			sb.append("Case " + i + ": " + total + "\n");
			i++;
		}
		System.out.print(sb);
		
		
		br.close();
	}
}
