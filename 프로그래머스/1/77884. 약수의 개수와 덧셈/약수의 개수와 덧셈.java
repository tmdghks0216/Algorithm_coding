class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        for(int i = left; i < right + 1; i++){
            int count = countDivisors(i);
            System.out.println(count);
            if(count%2 == 0){
                answer += i;
            }else{
                answer -= i;
            }
        }
        return answer;
    }
    
    public  int countDivisors(long N) {
        if (N <= 0){
            return 0; 
        }
        int count = 1; 

        for (long i = 2; i * i <= N; i++) {
            if (N % i == 0) {
                int exponent = 0; 
                while (N % i == 0) {
                    exponent++;
                    N /= i;
                }
                count *= (exponent + 1); 
            }
        }

        
        if (N > 1) {
            count *= 2; 
        }

        return count;
    }
}