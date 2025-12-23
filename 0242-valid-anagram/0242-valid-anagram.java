class Solution {
    public boolean isAnagram(String s, String t) {
       if(s.length()!=t.length()){
        return false;
       }
       int[] p=new int[26];
       for(int i=0;i<s.length();i++){
        p[s.charAt(i)-'a']++;
       }
       for(int i=0;i<t.length();i++){
        p[t.charAt(i)-'a']--;
        if(p[t.charAt(i)-'a']<0){
            return false;
        }
       }
       return true;
    }
}