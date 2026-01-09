class Solution {
    public int findMin(int[] nums) {
          int max=nums[0];
        for(int i:nums){
         max=Math.min(i,max);
        }
        return max;
    }
}