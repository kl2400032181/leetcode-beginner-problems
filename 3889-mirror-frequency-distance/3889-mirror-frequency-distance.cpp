class Solution {
public:
    int mirrorFrequency(string s) {
       vector<int> freq(128,0);
        for(char c: s){
            freq[c]++;
        }
        int result=0;
        for(char c='a';c<='m';c++){
            char mirror='a'+('z'-c);
            result+=abs(freq[c]-freq[mirror]);
        }
        for(char c='0';c<='4';c++){
            char mirror='0'+('9'-c);
            result+=abs(freq[c]-freq[mirror]);
        }
        return result;
    }
};