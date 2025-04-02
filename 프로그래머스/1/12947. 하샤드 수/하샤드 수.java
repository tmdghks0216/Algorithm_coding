import java.util.*;
class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String[] st = Integer.toString(x).split("");
        int sum = 0;
        for(String s : st){
            sum += Integer.parseInt(s);
        }
        if(x % sum != 0){
            answer = false;
        }
        return answer;
    }
}