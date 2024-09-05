class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] check = {"zero", "one", "two",
                          "three", "four", "five",
                          "six", "seven", "eight",
                          "nine"};
        for(int i = 0; i < check.length; i++) {
            
            if(s.contains(check[i])) {
                s = s.replace(check[i], i + "");
            }
        }
        
        return Integer.parseInt(s);
    }
}