class Solution {
    public int maximumDifference(int[] nums) {
        int min=Integer.MAX_VALUE;
        int maxsum=0;
        for(int i=0;i<nums.length;i++){
            min=Math.min(min,nums[i]);
            maxsum=Math.max(maxsum,nums[i]-min);
        }
            if(maxsum<=0){
                return -1;
            }
        return maxsum;
    }
}