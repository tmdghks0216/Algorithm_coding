import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] works = new int[progresses.length];
        List<Integer> list = new ArrayList<>();
        
        for(int i =0; i<progresses.length; i++){
            int program = 100 - progresses[i];
            int remain =  program % speeds[i];
            if(remain == 0){
              works[i] = program / speeds[i];
            } else{
            works[i] = program / speeds[i] + 1;     
            }              
        }
        
        int x = works[0];
        int count=1;
        for(int i = 1; i < works.length; i++){
            
            if(x>=works[i]){
                count+=1;
            }else{
                list.add(count);
                count =1;
                x= works[i];
            }
        }
        list.add(count);
        
         int[] answer = new int[list.size()];
        for(int i =0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}