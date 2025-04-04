class Solution {
    public String solution(int[] food) {
        String answer = "";
        for(int i = 1; i<food.length; i++){
            int num = food[i]/2;
            for(int j = 0; j<num; j++){
                answer += i;
            }         
        }
         String reversedStr = new StringBuilder(answer).reverse().toString();
        return answer + "0"+ reversedStr;
    }
}