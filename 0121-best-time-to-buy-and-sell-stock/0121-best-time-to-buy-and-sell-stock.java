class Solution {
    public int maxProfit(int[] p) {
        int minp=p[0];
        int maxprofit=0;
        for(int i=1;i<p.length;i++){
            if(p[i]<minp){
                minp=Math.min(minp,p[i]);
            }else {
                int curp=p[i]-minp;
                maxprofit=Math.max(maxprofit,curp);
            }
        }
        return maxprofit;
    }
}