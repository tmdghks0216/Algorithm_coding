class Solution {
    public String solution(String s) {
        String answer = "";
          char[] sp = s.toCharArray();
        int num = 0;
        for(int i = 0; i < sp.length; i++){
            if(sp[i] == ' '){
                answer += " ";
                num = 0;
                continue;
            }else if(num%2==0){
                 answer  += Character.toUpperCase(sp[i]); 
            }else{
                answer  += Character.toLowerCase(sp[i]); 
            }
            num++;
        } 

    
        return answer;
    }
}