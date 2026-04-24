class Solution {
    public int minimumIndex(int[] capacity, int itemSize) {
        int c=Integer.MAX_VALUE;
        int k=-1;
        for(int i=0;i<capacity.length;i++){
            if(capacity[i]>=itemSize&&capacity[i]<c){
                c=capacity[i];
                k=i;
            }
        }
        
            return k;
        }
    }