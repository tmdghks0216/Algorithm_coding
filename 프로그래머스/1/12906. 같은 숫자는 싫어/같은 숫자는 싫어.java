import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
      Stack<Integer> stack = new Stack<>();
        for(int i : arr){
            if(stack.isEmpty()){
                stack.add(i);
                continue;
            }
            if(stack.peek() != i){
                stack.add(i);
            }
        }
        
        int[] answer = new int[stack.size()];
        int i = 0;
        for (Integer num : stack) {
            answer[i++] = num; 
        }
        return answer;
    }
}