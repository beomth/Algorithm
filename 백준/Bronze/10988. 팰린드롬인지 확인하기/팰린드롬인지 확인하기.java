import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int i = 0;
        int j = str.length() - 1;
        int cnt = 0;
        while (i < j) {
            if (str.charAt(i) == str.charAt(j)) {
                i++;
                j--;
            }
            else{
                System.out.println(0);
                break;
            }
            cnt++;
        }

        if (cnt == (str.length() / 2)) {
            System.out.println(1);
        }
    }
}