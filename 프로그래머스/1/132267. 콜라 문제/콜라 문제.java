class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        while(n >= a){
            int i = n/a;
            int j = n%a;
            n = i*b+j;
            answer += i*b;
        }
        return answer;
    }
}