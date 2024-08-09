import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        
        // 배열 크기가 1인 경우
        if(arr.length == 1) {
            arr[0] = -1;
            return arr;
        }
        int min = Integer.MAX_VALUE;
        int index = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
            if(arr[i] < min) {
                min = arr[i];
                index = i;
            }
        }
        list.remove(index);
//         for(int i = 0; i < list.size(); i++) {
//             System.out.print(list.get(i) + " ");
            
//         }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}