import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        // 1. X, N, 2차원 배열 생성
        long X = sc.nextLong();
        int N = sc.nextInt();

        int[][] arr = new int[N][2];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // 2. arr의 행의 두 원소를 곱해서 더한다
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i][0] * arr[i][1];
        }
        if (sum == X) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
        // 3. X와 맞으면 Yes, 아니면 No

    }
}
