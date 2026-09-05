class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0;
        int p=0;
        for(int i=0;i<k;i++){
         sum+=nums[i];
        }
        int max=sum;
        for(int i=k;i<nums.length;i++){
            sum-=nums[p];
            sum+=nums[i];
            p++;
            max=Math.max(sum,max);
        }
        return (double)max/k;
        
    }
}