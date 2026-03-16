class Solution {
    public int[] twoSum(int[] nu, int target) {
        int n=nu.length;
        int l=0;
        int r=n-1;
       while(l<r){
            int h=nu[l]+nu[r];
            if(h==target){
                return new int[]{l+1,r+1};
            }else if(h<target){
                l++;
            }else{
                r--;
            }
       }
            return new int[]{-1,-1};
        }
    

}