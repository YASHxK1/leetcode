class Solution {
public:
    string mergeAlternately(string word1, string word2) {
        string str;
        int strsize = word1.length() + word2.length();
        int i=0,j=0;
        while (i < word1.length()||j < word2.length()){
        if(i < word1.length())str.push_back(word1[i++]);
        if(j < word2.length())str.push_back(word2[j++]);
    }        
    return str;     
    }
};