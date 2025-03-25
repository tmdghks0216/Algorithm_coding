class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
            int sumSides = brown / 2;
        for(int length = sumSides - 1; length >= sumSides / 2 ; length--){
            int width = sumSides - length;
            if((width-1) * (length-1) == yellow){
                answer[0] = length + 1;
                answer[1] = width + 1;
                return answer;
            }
        }
         return answer;
    }
}