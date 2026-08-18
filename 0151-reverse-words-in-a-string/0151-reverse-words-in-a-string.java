class Solution {
    public String reverseWords(String s) {
        String[] h=s.trim().split("\\s+");
        String r="";
        for(int i=h.length-1;i>=0;i--){
            if(i!=0){
             r+=h[i]+" ";
            }else{
                r+=h[i];
            }
        }
        return r;
        
    }
}