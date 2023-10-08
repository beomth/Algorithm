import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] num = new int[10000 + 10];

        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                num[i]++;
            }
        }

        int cnt = 0;
        for (int j = 0; j < num.length; j++) {
            if (num[j] == 1) {
                cnt++;
            }
            if (cnt == K) {
                System.out.println(j);
                break;
            }
        }

        if (cnt != K) {
            System.out.println(0);
        }

    }
}