import java.util.*;
class Solution {
    boolean solution(String s) {
        boolean answer = false;
        String[] sp = s.toUpperCase().split("");
        int p = 0;
        int y =0;
        for(String i : sp){
            if(i.equals("P")){
                p += 1;
            }else if(i.equals("Y")){
                y += 1;
            }
        }
        if(p == y){
            answer = true;
        }


        return answer;
    }
}