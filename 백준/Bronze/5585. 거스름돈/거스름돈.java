import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main{
	public static void main(String[] args) throws IOException{
		//500, 100, 50, 5, 1
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = 1000 - Integer.parseInt(br.readLine());
		int answer = 0;
		int check = 0;
		while(n != 0) {
			answer += n / 500;
			n = n % 500;
			if(n == 0)	break;
			answer += n / 100;
			n = n % 100;
			if(n == 0)	break;
			answer += n / 50;
			n = n % 50;
			if(n == 0)	break;
			answer += n / 10;
			n = n % 10;
			if(n == 0)	break;
			answer += n / 5;
			n = n % 5;
			if(n == 0)	break;
			answer += n / 1;
			break;
					
		}
		System.out.println(answer);
		br.close();
	}
}
