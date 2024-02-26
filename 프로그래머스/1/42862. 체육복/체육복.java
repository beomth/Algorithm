import java.util.HashSet;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] student = new int[n+2];
        student[0] = 0;
        student[n+1] = 0;

        for (int i : reserve) {
            student[i]++;
        }
        for (int i : lost) {
            student[i]--;
        }

        for (int j = 1;  j < student.length; j++ ) {
            if (student[j] == 1) {
                if (student[j - 1] == -1) {
                    student[j - 1]++;
                    student[j]--;
                } else if (student[j + 1] == -1) {
                    student[j+1]++;
                    student[j]--;
                }
            }
        }
        int cnt = 0;
        for (int k : student) {
            if (k < 0) {
                cnt++;
            }
        }
        return n - cnt;

    }
}