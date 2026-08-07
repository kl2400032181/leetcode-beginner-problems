class Solution {
    public int maxSubArray(int[] nums) {
        int cur=nums[0];
        int maxp=nums[0];
        for(int i=1;i<nums.length;i++){
          cur=Math.max(nums[i],nums[i]+cur);
          maxp=Math.max(maxp,cur);
        }
        return maxp;
        
    }
}