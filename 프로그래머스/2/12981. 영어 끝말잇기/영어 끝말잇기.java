import java.util.*;

// 앞글자와 뒷글자 체크
// 중복단어 체크
// 없으면 0,0 리턴

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        Map<String,Integer> map = new HashMap<>();

        for(int i = 0; i < words.length; i++){
         if(i == 0){
             map.put(words[i],1);
            continue;   
         }   
            
        int count = map.getOrDefault(words[i],0);
         if(count == 0 ){
             String[] start = words[i-1].split("");
             if(words[i].startsWith(start[start.length-1])){
              map.put(words[i],1);
              continue;   
             }else{
                 
             }
          } 
            
        int avg = ((i+1) % n == 0) ? n : (i+1) % n ;
        answer[0] = avg ;
        answer[1] = i/n +1;
        break;         
        }
        
        return answer;
    }
}