class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        for(int i = 0; i < babbling.length; i++) {
            //  연속된 발음은 어려워 한다
            if(babbling[i].contains("ayaaya") || babbling[i].contains("yeye") || babbling[i].contains("woowoo") || babbling[i].contains("mama")) {
                continue;
            }
            
            babbling[i] = babbling[i].replace("aya", " ");
            babbling[i] = babbling[i].replace("ye", " ");
            babbling[i] = babbling[i].replace("woo", " ");
            babbling[i] = babbling[i].replace("ma", " ");
            babbling[i] = babbling[i].replace(" ", "");

            if(babbling[i].length() == 0) answer++;
        }
        return answer;
    }
}