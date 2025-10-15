class Solution {
    public boolean isPalindrome(String s) {
         s=s.toLowerCase().replaceAll("[^a-z0-9]","");
        int p=0;
        int r=s.length()-1;
        while(p<r){
            if(s.charAt(p)!=s.charAt(r)){
                return false;
            }
            p++;
            r--;
        }
        return true;
    }
}