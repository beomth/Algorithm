class Solution {
    public int solution(String my_string, String target) {
        int answer = 0;
        int cnt = 0;
        for(int i = 0; i < my_string.length(); i++) {
            //  문자열이 같지 않을 때
            if(my_string.charAt(i) != target.charAt(cnt)) {
                continue;
            }
            //  문자열이 같을 때
            else {
                cnt++;
                if(cnt == target.length())  {
                    answer = 1;
                    break;
                }
            }
        }
        return answer;
    }
}