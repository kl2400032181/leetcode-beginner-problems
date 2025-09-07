class Solution {
    public int gcdOfOddEvenSums(int n) {
        int h=0,m=0;
       for(int i=1;i<=2*n-1;i+=2){
           h++;
       }
        for(int i=2;i<=2*n;i+=2){
            m++;
        }
       while(m!=0){
           int temp=m;
          m=h%m;
           h=temp;
       }
        return h;
    }
}
