class Solution {
    public long solution(int n) {
        long answer = 0;
        int sum =0;
        int[] list = new int[n+2];
        list[1] = 1;
        list[2] = 2;
    
        for(int i = 3; i<n+1; i++){
            list[i] = (list[i-1] +  list[i-2]) % 1234567;
        }
        return list[n];
    }
}