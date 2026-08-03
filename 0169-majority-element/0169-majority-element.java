class Solution {
    public int majorityElement(int[] nums) {
        int c=0;
        int ca=0;
        for(int i:nums){
            if(c==0){
                ca=i;
            }
            if(ca==i){
               c++;
            }else{
                c--;
            }
        }
        return ca;
        
    }
}