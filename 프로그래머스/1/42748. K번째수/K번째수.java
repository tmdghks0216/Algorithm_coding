import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i = 0; i<commands.length; i++){
           int[] arr = commands[i];
            List<Integer> list = new ArrayList<>();
           for(int j = arr[0]-1; j<arr[1]; j++){
               list.add(array[j]);
           } 
            Collections.sort(list);
            answer[i] = list.get(arr[2]-1);
        }
        return answer;
    }
}