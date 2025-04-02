import java.util.*;

class Solution {
    public long solution(long n) {
        String[] sp = Long.toString( n).split("");
        List<Long> list = new ArrayList<>();
        for (String s : sp) {
            list.add(Long.parseLong(s));
        }
        

        list.sort(Comparator.reverseOrder());
        

        long answer = 0;
        for (int i = 0; i < list.size(); i++) {
            answer = answer * 10 + list.get(i);  
        }
        
        return answer;
    }
}