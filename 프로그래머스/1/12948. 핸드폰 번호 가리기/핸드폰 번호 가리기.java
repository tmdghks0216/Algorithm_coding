class Solution {
    public String solution(String phone_number) {
        String answer = "";
        int length = phone_number.length();
        phone_number = phone_number.substring(length -4);
        for(int i = 0; i< length -4; i++){
            answer +="*";
        }
        return answer + phone_number;
    }
}