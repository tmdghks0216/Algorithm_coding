import java.util.*;
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        boolean ck = false;    
        for(int i = 0; i<discount.length -9; i++){
            Map<String,Integer> map = new HashMap<>();

            for(int k = 0; k<10; k++){
                map.put(discount[i+k], map.getOrDefault(discount[i+k],0)+1);  
            }
           boolean valid = true; 
            for(int j = 0; j<want.length; j++){
                int count = number[j];
                String wantName = want[j];
                if(map.getOrDefault(wantName, 0) != count){
                      valid = false;
                    break;
                }
            }
        
              if (valid) {
                answer++;
            }
        }
        
        return answer;
    }
}