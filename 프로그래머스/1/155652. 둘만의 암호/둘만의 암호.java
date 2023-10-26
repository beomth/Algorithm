class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
		
		// skip을 비교하기 쉽게 char 배열로 변경
		for(int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			for(int j = 0; j < index; j++) {
				ch = (char)(ch + 1);
				if(ch > 'z') {
					ch = (char)(ch - 26);
				}
				if(skip.contains(String.valueOf(ch))) {
					j--;
				}
			}
			answer = answer + ch;
		}
		return answer;
        
    }
}