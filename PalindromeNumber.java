class Solution {
    public boolean isPalindrome(int x) {
        int r=0;
        int c=x;
        while(c>0){
            r=r*10+c%10;
            c/=10;
        }
        if(r==x){
            return true;
        }else{
            return false;
        }
    }
}