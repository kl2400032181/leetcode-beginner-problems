class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        int p=n-k;
        int[] f=new int[n];
        int l=0;
        while(k>0){
            f[l]=nums[n-k];
            l++;
            k--;
        }
        int g=0;
        while(p>0){
            f[l]=nums[g];
            g++;
            l++;
            p--;
        }
        for(int i=0;i<n;i++){
           nums[i]=f[i];
        }
        for(int i=0;i<n;i++){
            System.out.print(nums[i]+" ");
        }

        
    }
}