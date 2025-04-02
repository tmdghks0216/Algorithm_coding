import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String[] st = Integer.toString(n).split("");
        for(String i : st){
            int num = Integer.parseInt(i);
            answer += num;
        }

        return answer;
    }
}