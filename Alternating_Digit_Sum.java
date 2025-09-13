class Solution {
    public int alternateDigitSum(int n) {
        int h=0,m=0,b=0;
        while(n>0){
            int k=n%10;
            if(m%2==0){
                h+=k;
            }else{
               b+=k;
            }
            m++;
            n/=10;
            
        }
        if(m%2==0){
            return b-h;
        }else{
            return h-b;
        }

    }
}
