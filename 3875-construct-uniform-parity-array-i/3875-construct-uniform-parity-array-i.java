class Solution {
    public boolean uniformArray(int[] nums1) {
        int n=nums1.length;
        if(n==1)return true;
        int e=0,o=0;
        for(int num:nums1){
            if(num%2==0)e++;
            else o++;
        }
            if(e>0)return true;
            if(o>=2) return true;
        return false;
        
    }
}
