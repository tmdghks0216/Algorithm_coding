class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        long num = Long.parseLong(p);
        int tLength = t.length();
        int pLength = p.length();

        for(int i = 0; i <= tLength- pLength; i++){
           String sub = t.substring(i, pLength + i);
            if(num>=Long.parseLong(sub)){
                answer++;
            }
        }

        return answer;
    }
}