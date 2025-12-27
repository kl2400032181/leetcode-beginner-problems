class Solution {
    public int maxProfit(int[] p) {
        int maxprofit=0;
        int minprice=Integer.MAX_VALUE;
        for(int price:p){
                minprice=Math.min(price,minprice);
                maxprofit=Math.max(maxprofit,price-minprice);
            
        }
        return maxprofit;
    }
}