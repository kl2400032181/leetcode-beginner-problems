class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        String h=s;
        StringBuilder sb=new StringBuilder(s).reverse();
        if(h.equals(sb.toString())){
            return true;
        }else{
            return false;
        }
        
    }
}