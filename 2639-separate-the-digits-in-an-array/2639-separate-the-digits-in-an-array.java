class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> digits=new ArrayList<>();
        for(int n: nums){
           for(char c: String.valueOf(n).toCharArray()){
            digits.add(c-'0');
           }
        }
        int[] result=new int[digits.size()];
        for(int i=0;i<digits.size();i++){
            result[i]=digits.get(i);
        }
        return result;
    }
}