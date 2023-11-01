class Solution {
    public int solution(String t, String p) {
       int answer = 0;

        //1. while

        int i = 0;
        int j = 0;
        j = i + p.length();
        while(j <= t.length()) {
            

            if (Long.parseLong(t.substring(i, j)) <= Long.parseLong(p)) {
                answer++;
            }
            i += 1;
            j += 1;
        }

        return answer;
    }
}