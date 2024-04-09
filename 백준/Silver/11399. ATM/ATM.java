import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] array = new int[n];
		String[] str = br.readLine().split(" ");
		for(int i = 0; i < array.length; i++) {
			array[i] = Integer.parseInt(str[i]);
		}
		Arrays.sort(array);
		int sum = 0;
		int j = 0;
		for(int i = array.length; i >= 1; i--) {
			sum += array[j] * i;
			j++;
		}
		System.out.println(sum);
		
		br.close();
	}
}
