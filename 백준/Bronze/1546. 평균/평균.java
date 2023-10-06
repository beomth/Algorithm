import java.util.Scanner;

public class Main{
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		
		double[] arrays;
		int N;
		double sum = 0;
		double max = 0;
		
		N = input.nextInt();
		arrays = new double[N];
		        
		for(int i = 0; i < arrays.length; i++) {
			arrays[i] = input.nextInt();
			if(arrays[i] > max) {
				max = arrays[i];
			}
		}
		
		for(int j = 0; j < arrays.length; j++) {
			arrays[j] = (arrays[j]/max)*100;
			sum = sum + arrays[j];		
		}
		
		double k = sum/N;
		System.out.println(k);
	}
}