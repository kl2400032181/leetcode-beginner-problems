class Solution {
    public int findMin(int[] nums) {
        int max=nums[0];
        for(int j:nums){
            if(j<max){
                max=j;
            }
        }
        return max;
    }
}