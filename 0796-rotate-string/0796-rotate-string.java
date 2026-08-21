class Solution {
    public boolean rotateString(String s, String g) {
        if(s.length()!=g.length()){
            return false;
        }else{
            String k=s+s;
           if(!k.contains(g)){
            return false;
           }else{
            return true;
           }
        }
        
    }
}