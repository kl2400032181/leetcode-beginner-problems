class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashMap<Character, Integer> mad=new HashMap<>();
        for(char i: stones.toCharArray()){
            mad.put(i,mad.getOrDefault(i,0)+1);
        }
        int v=0;
        for(char c:jewels.toCharArray()){
            if(mad.containsKey(c)){
                 v+=mad.get(c);
            }
        }
        return v;
    }
}