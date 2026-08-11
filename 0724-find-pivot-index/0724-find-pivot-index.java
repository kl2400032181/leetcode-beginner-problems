class Solution {
    public int pivotIndex(int[] nums) {
        int ls=0;
        int sum=0;
        for(int i=0;i<nums.length;i++){
          sum+=nums[i];
        }
        for(int i=0;i<nums.length;i++){
           int rs=sum-ls-nums[i];
           if(rs==ls){
            return i;
           }
           ls+=nums[i];
        }
        return -1;
    }
}