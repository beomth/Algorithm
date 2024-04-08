import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		String str = br.readLine();
		StringBuilder answer = new StringBuilder();
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == 'S') {
				answer.append("*S");
			}
			else {
				answer.append("*LL");
				
                i++;
			}
		}
		answer.append("*");
		String st = answer.toString();
		int count = 0;
		for(int i = 0; i < st.length(); i++) {
			if(st.charAt(i) == '*')	count++;	
		}
		System.out.print(Math.min(count, n));
	}
}
