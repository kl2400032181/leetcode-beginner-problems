class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int value=0,result=0;
        for(int n:nums){
             value=hm.getOrDefault(n,0)+1;
            hm.put(n,value);
         if(value>=2){
            return true;
         }
    }
    return false;
    }
}