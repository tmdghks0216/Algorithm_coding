import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        
        for (int i = 0; i < s.length(); i++) {
            Stack<Character> stack = new Stack<>();
            String str = s.substring(i, s.length()) + s.substring(0, i);    
            String[] sp = str.split("");
            Stack<String> st = new Stack<>();
            
            for(String c : sp){
                if(st.isEmpty()){
                    st.push(c);
                    continue;
             }
            
                if(c.equals("]") && st.peek().equals("[")){
                    st.pop();
                } else if(c.equals(")") && st.peek().equals("(")){
                    st.pop();
                } else if(c.equals("}") && st.peek().equals("{")){
                    st.pop();
                }else{
                    st.push(c);
                }
            }
            
            if(st.isEmpty()){
                answer++;
            }
            
            }
        return answer;
    }
}