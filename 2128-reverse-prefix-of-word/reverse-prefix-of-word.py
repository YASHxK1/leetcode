class Solution:
    def reversePrefix(self, word: str, ch: str) -> str:
        s = list(word)
        index:int = 0
        i:int = 0
        for i in range(len(word)):
            if word[i] == ch:
                s[0:i+1] = reversed(s[0:i+1])
                break 
                
        return "".join(s)
                