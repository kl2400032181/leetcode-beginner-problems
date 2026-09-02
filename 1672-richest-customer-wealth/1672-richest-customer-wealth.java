class Solution {
    public int maximumWealth(int[][] a) {
        int ri=Integer.MIN_VALUE;
        for(int[] r:a){
            int sum=0;
            for(int m:r){
                sum+=m;
            }
            ri=Math.max(sum,ri);
        }
        return ri;
    }
}