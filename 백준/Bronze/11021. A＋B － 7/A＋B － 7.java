import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        int A, B;
        int k;

        k = input.nextInt();
        
        for(int i = 0; i < k; i++) {
            A = input.nextInt();
            B = input.nextInt();
            System.out.println("Case #"+(i+1)+": "+(A+B));
        }
    }
}
