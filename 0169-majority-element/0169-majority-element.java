class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> mad=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            mad.put(n,mad.getOrDefault(n,0)+1);
        }
        int p=0;
        int g=0;
        for(int key:mad.keySet()){
            if(mad.get(key)>p){
                p=mad.get(key);
                g=key;
            }
        }
        return g;
    }
}