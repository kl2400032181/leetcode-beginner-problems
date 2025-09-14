class Solution {
    public int earliestTime(int[][] tasks) {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<tasks.length;i++){
            int f=tasks[i][0]+tasks[i][1];
                if(f<min){
                    min=f;
                }
            }
        return min;
    }
}©leetcode
