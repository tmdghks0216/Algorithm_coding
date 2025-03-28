import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Map<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        
        for(int i : tangerine){
            map.put(i , map.get(i) == null ? 1 : map.get(i) + 1);
        }
        
         List<Integer> counts = new ArrayList<>(map.values());
         counts.sort((a, b) -> b - a);
        
        for(int i : counts){
            sum += i;
            answer++;
            if(sum>=k){
                break;
            }
        }
        
        return answer;
    }
}