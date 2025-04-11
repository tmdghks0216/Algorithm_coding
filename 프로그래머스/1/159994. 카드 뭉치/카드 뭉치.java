class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
        int i =0;
        int j = 0;
        for(int n = 0; n<goal.length; n++){
            if(i<cards1.length && cards1[i].equals(goal[n])){
                i++;
                continue; 
            }
            if(j<cards2.length && cards2[j].equals(goal[n])){
                j++;
                continue; 
            }
            return "No";
        }
        return "Yes";
    }
}