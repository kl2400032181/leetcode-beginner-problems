class Solution {
    public int differenceOfSum(int[] nums) {
        int h=0,m=0,j=0;
        for(int i=0;i<nums.length;i++){
            j+=nums[i];
         int b=nums[i];
            while(b>0){
                int k=b%10;
                m+=k;
                b/=10;
            }
         }
        
       
         int r=Math.abs(m-j);
        return r;

    }
}
