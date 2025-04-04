import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        Set<Integer> set =new HashSet<>();
        for(int i = 0; i<numbers.length; i++){
            for(int j = 1; j<numbers.length; j++){
                if(j == i){
                    continue;
                }
                set.add(numbers[i]+numbers[j]);
            }
        }
        
        return set.stream()
                  .sorted()
                  .mapToInt(Integer::intValue) 
                  .toArray();
    }
}