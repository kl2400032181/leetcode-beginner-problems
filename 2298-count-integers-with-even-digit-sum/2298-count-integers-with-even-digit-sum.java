class Solution {
    public int countEven(int num) {
        int m=0;
        for(int i=1;i<=num;i++){
         int k=i;
         int sum=0;
         while(k>0){
            int l=k%10;
            sum+=l;
            k/=10;
         }
         if(sum%2==0){
           m++;
         }
        }
        return m;
    }
}