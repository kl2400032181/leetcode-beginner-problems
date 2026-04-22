class Solution {
    public boolean uniformArray(int[] nums1) {
        int n=nums1.length;
        int min=Integer.MAX_VALUE;
        int even=0,odd=0;
        for(int num: nums1){
            min=Math.min(min,num);
                if(num%2==0)even++;
                else odd++;
            }
        if(min%2==1)return true;
        return odd==0;
        }
        
    }
