class Solution {
    public boolean isPalindrome(int x) {
        int rev=0;
        int h=x;
        if(x<0){
            return false;
        }else{

            while(x>0){
             rev=rev*10+x%10;
             x/=10;
            }
            if(rev==h){
                return true;
            }else{
                return false;
            }
        }
        
    }
}