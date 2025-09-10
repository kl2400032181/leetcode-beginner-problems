class Solution {
    public int[] runningSum(int[] a) {
        for(int i=1;i<a.length;i++){
            a[i]=a[i-1]+a[i]; 
         }
         return a;
        }
}
