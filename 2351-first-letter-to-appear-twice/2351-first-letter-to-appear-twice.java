class Solution {
    public char repeatedCharacter(String s) {
        int[] f=new int[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            f[ch-'a']++;
            if(f[ch-'a']==2){
                return ch;
            }
        }
        return ' ';
        
    }
}