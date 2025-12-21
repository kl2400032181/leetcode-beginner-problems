class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer, Integer> hm=new HashMap<>();
        int max=0,r=0,l=0;
        for(int k:nums){
            if(k%2==0){
                 l=hm.getOrDefault(k,0)+1;
                hm.put(k,l);
        }else{
            continue;
        }
       if(l>max){
        max=l;
          r=k;
       }else if(l==max){
        r=Math.min(r,k);
       }

        }
        return max==0?-1:r;
    }
}