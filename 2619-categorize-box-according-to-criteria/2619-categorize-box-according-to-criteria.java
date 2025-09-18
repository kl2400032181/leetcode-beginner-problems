class Solution {
    public String categorizeBox(int l, int w, int h, int m) {
        long t=1L*l*w*h;
        boolean Bulky=(l>=10_000||w>=10_000||h>=10_000||t>=1_000_000_000L);
        boolean Heavy=m>=100;
        if(Bulky&&Heavy) return "Both";
        else if(Bulky) return  "Bulky";
        else if(Heavy) return "Heavy";
        else return "Neither";
    }
}