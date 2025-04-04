import java.util.*;
class Solution {
    public int[] solution(String s) {
        Map<String,Integer> map = new HashMap<>();
        String[] st = s.split("");
        int[] answer = new int[st.length];
        for(int i = 0; i < st.length; i++){
            int num = map.getOrDefault(st[i], 0);

            if(num == 0){
                answer[i] = -1;
            }else{
                answer[i] = i+1 - num;
            }
             map.put(st[i],i+1);
        }
        return answer;
    }
}