import java.util.*;

class Solution {
    public int solution(int[] elements) {
        int answer = 0;
        int length = elements.length;
        
        HashSet<Integer> set = new HashSet<>();
        
        for(int i = 0; i<length; i ++){ 
            int sum = 0;
             for(int j = 0; j<length; j++){
                sum += elements[(i+j) % length];
                set.add(sum);       
            }
        }
        return set.size();
    }
}