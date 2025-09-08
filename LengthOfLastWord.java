class Solution {
    public int lengthOfLastWord(String s) {
        String [] w=s.trim().split(" ");
        return w[w.length-1].length();
        }
}
    

