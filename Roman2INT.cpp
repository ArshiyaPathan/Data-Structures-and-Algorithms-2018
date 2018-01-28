class Solution {
public:
    int romanToInt(string s) {
       map<char,int>Table={ { 'I', 1 }, { 'V', 5 }, { 'X', 10 }, { 'L', 50 }, { 'C', 100 }, { 'D', 500 }, { 'M', 1000 } };
        if(s.length()==0)
            return 0;
        int res = Table[s[s.length()-1]];
        
        for(int i=s.length()-2; i>=0; i--){
            if(Table[s[i]] < Table[s[i+1]])
                res -= Table[s[i]];
            else
                res += Table[s[i]];
        }
        return res;
    }
};