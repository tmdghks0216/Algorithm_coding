class Solution {
    public int solution(int[][] sizes) {
        int max = 0;
        int max2 = 0;
        
        for(int i = 0; i < sizes.length; i++){
           int w = Math.max(sizes[i][0],sizes[i][1]);
           int h = Math.min(sizes[i][0],sizes[i][1]);
           if(max < w){
               max = w;
           } 
           if(max2 < h){
               max2 = h;
           } 
        }
        return max * max2;
    }
}