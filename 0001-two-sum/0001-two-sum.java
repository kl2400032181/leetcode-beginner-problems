class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        HashMap<Integer,Integer> p=new HashMap<>();
        for(int i=0;i<n;i++){
            int h=target-nums[i];
            if(p.containsKey(h)){
                return new int[]{p.get(h),i};
            }
            p.put(nums[i],i);

        }
        return new int[]{-1,-1};
    }
}