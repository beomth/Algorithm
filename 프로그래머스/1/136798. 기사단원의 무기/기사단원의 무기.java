class Solution {
    public int solution(int number, int limit, int power) {
        int[] arr = new int[number];    //약수 개수를 담는 배열
        // arr에 약수 담기
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            for(int j = 1; j <= Math.sqrt(i+1); j++) {
                if ((i+1) % j == 0) {
                    if((i+1) / j == j)  arr[i] += 1;
                    else    arr[i] += 2;
                }
            }
            if(arr[i] > limit)  arr[i] = power;
            sum += arr[i];
        }
        
        return sum;
    }
}