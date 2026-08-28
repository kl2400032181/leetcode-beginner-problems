class Solution {
    public int firstUniqChar(String s) {
        int[] f=new int[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            f[ch-'a']++;
        }
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(f[ch-'a']==1){
                return i;
            }
        }
        return -1;
    }
}