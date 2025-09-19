class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
       for(int i=0;i<k/2;i++){
           int l=x+i;
           int p=x+(k-1-i);
           for(int j=0;j<k;j++){
               int f=y+j;
               int z=grid[l][f];
               grid[l][f]=grid[p][f];
               grid[p][f]=z;
           }
           
       }
       return grid;
    }
}