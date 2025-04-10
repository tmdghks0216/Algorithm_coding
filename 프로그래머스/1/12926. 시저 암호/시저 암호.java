class Solution {
    public String solution(String s, int n) {
          String answer = "";
        char[] st = s.toCharArray(); 
        for(char s1 : st){
            if(s1 == ' '){  
                answer += " ";
                continue;
            }
            
            // 소문자 처리
            if (s1 >= 'a' && s1 <= 'z') {
                int nextChar = (int) s1 + n;
                if (nextChar > (int) 'z') {
                    nextChar = (int) 'a' + (nextChar - (int) 'z') - 1;
                }
                answer += (char) nextChar;
            }
            // 대문자 처리
            else if (s1 >= 'A' && s1 <= 'Z') {
                int nextChar = (int) s1 + n;
                if (nextChar > (int) 'Z') {
                    nextChar = (int) 'A' + (nextChar - (int) 'Z') - 1;
                }
                answer += (char) nextChar;
            }
        }
        return answer;
    }
}