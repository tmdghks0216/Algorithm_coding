class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[arr1.length];
      for (int i = 0; i < n; i++){
            String binaryString = String.format("%"+n+"s", Integer.toBinaryString(arr1[i] | arr2[i]));
            binaryString = binaryString.replaceAll("1","#").replaceAll("0"," ");
            answer[i] =binaryString;
        }
        return answer;
    }
}